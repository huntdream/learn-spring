package info.maoyu.server.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import info.maoyu.server.model.User;

import javax.servlet.http.HttpServletRequest;

public class JwtTokenProvider {
    private final String secKey = "You Want It Darker";
    private final Algorithm algorithm = Algorithm.HMAC256(secKey);

    public String createToken(String username, User user) {
        String issuer = user.getName();
        return JWT.create()
                .withSubject(username)
                .withIssuer(issuer)
                .sign(algorithm);
    }

    public String resolveToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        } else {
            return null;
        }
    }

    public boolean validateToken(String token, User user) {
        try {
            String issuer = user.getName();
            JWTVerifier verifier = JWT.require(algorithm).withIssuer(issuer).build();
            DecodedJWT decodedJWT = verifier.verify(token);
            return  true;
        } catch (JWTVerificationException exception) {
            return false;
        }
    }
}

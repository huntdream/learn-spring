package info.maoyu.server.configuration;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

public class JwtUtil {
    final private Algorithm algorithm = Algorithm.HMAC256("lore");

    public String encode(String username) {
        return JWT.create().withSubject(username).withIssuer("admin").sign(algorithm);
    }

    public DecodedJWT decode(String token) {
        try {
            JWTVerifier verifier = JWT.require(algorithm).build();
            DecodedJWT decoded = verifier.verify(token);
            return decoded;
        } catch (JWTDecodeException exception) {
            System.out.print("invalid token");
            return null;
        }
    }
}

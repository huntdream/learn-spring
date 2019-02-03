package info.maoyu.server.configuration;

import com.auth0.jwt.algorithms.Algorithm;

public class JwtGenerator {
    Algorithm algorithm = Algorithm.HMAC256("lore");
}

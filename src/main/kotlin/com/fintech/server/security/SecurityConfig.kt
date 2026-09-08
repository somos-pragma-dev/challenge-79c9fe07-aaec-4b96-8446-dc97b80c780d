package com.fintech.server.security

import io.ktor.application.ApplicationCallPipeline
import io.ktor.application.call
import io.ktor.auth.Authentication
import io.ktor.auth.authenticate
import io.ktor.auth.jwt.jwt
import io.ktor.auth.principal
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.interfaces.DecodedJWT
import com.auth0.jwt.interfaces.JWTVerifier

object SecurityConfig {
    private val secret = "secret"
    private val algorithm = Algorithm.HMAC256(secret)
    private val verifier: JWTVerifier = JWT.require(algorithm).build()

    fun generateToken(userId: String): String {
        return JWT.create()
           .withClaim("userId", userId)
           .sign(algorithm)
    }

    fun verifyToken(token: String): DecodedJWT? {
        return try {
            verifier.verify(token)
        } catch (e: Exception) {
            null
        }
    }

    fun configure(routing: Routing) {
        routing.authenticate("jwt") {
            get("/protected") {
                val principal = call.principal<JWTPrincipal>()
                val userId = principal?.payload?.getClaim("userId")?.asString()
                call.respond("Welcome, $userId! This is a protected route.")
            }
        }
    }
}
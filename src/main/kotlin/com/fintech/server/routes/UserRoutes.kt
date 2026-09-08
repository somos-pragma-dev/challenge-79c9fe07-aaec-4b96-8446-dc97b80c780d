package com.fintech.server.routes

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.routing
import com.fintech.server.model.User
import org.jetbrains.exposed.sql.transactions.transaction

object UserRoutes {
    fun configure(routing: io.ktor.routing.Routing) {
        routing {
            get("/users") {
                val users = transaction {
                    User.all()
                }
                call.respond(users)
            }
            post("/users") {
                val user = call.receive<User>()
                transaction {
                    User.save(user)
                }
                call.respond(HttpStatusCode.Created)
            }
        }
    }
}
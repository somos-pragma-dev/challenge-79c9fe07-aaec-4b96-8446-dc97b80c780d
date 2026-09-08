package com.fintech.server

import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import com.fintech.server.config.DatabaseConfig
import com.fintech.server.routes.UserRoutes
import com.fintech.server.security.SecurityConfig

fun main() {
    DatabaseConfig.init()
    embeddedServer(Netty, port = 8080) {
        SecurityConfig.configure(this)
        UserRoutes.configure(this)
    }.start(wait = true)
}
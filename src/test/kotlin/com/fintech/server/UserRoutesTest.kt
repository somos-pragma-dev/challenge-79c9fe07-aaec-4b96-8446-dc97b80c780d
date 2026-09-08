package com.fintech.server

import io.ktor.application.ApplicationCall
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import io.ktor.util.KtorExperimentalAPI
import com.fintech.server.config.DatabaseConfig
import com.fintech.server.model.UserDTO
import org.junit.Test
import kotlin.test.assertEquals

@KtorExperimentalAPI
class UserRoutesTest {

    @Test
    fun `test get users`() {
        withTestApplication({ module(testing = true) }) {
            handleRequest(HttpMethod.Get, "/users").apply {
                assertEquals(HttpStatusCode.OK, response.status())
            }
        }
    }

    @Test
    fun `test create user`() {
        withTestApplication({ module(testing = true) }) {
            val user = UserDTO(0, "Test User", "test@example.com")
            handleRequest(HttpMethod.Post, "/users").apply {
                addHeader(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                setBody(Json.encodeToString(user))
                assertEquals(HttpStatusCode.Created, response.status())
            }
        }
    }
}
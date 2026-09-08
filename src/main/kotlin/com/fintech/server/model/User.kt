package com.fintech.server.model

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.transactions.transaction

object User : IntIdTable() {
    val name = varchar("name", 50)
    val email = varchar("email", 50)
}

data class UserDTO(val id: Int, val name: String, val email: String)

fun ResultRow.toUserDTO() = UserDTO(this[User.id], this[User.name], this[User.email])

fun User.all(): List<UserDTO> = transaction {
    User.selectAll().map { it.toUserDTO() }
}

fun User.save(user: UserDTO) = transaction {
    User.insert {
        it[name] = user.name
        it[email] = user.email
    }
}
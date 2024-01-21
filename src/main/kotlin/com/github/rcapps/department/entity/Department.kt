package com.github.rcapps.department.entity

import jakarta.persistence.Entity
import java.util.UUID

@Entity
data class Department(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    val description: String,
    val active: Boolean
)

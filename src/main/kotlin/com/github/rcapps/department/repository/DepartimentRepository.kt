package com.github.rcapps.department.repository

import com.github.rcapps.department.entity.Department
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface DepartimentRepository: CrudRepository<Department, UUID> {
}
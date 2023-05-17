package ua.kpi.its.lab.rest.repository

import org.springframework.data.jpa.repository.JpaRepository
import ua.kpi.its.lab.rest.entity.EntityExample

interface RepositoryExample : JpaRepository<EntityExample, Long>
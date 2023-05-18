package ua.kpi.its.lab.rest.repository

import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.context.support.BeanDefinitionDsl
import org.springframework.data.jpa.repository.JpaRepository

interface RoleRepository : JpaRepository<BeanDefinitionDsl.Role, Long> {
    fun findByName(name: String): BeanDefinitionDsl.Role?
}

interface UserRepository : JpaRepository<SecurityProperties.User, Long> {
    fun findByLogin(login: String): SecurityProperties.User?
}

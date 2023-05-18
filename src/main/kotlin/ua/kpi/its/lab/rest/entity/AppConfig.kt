package ua.kpi.its.lab.rest.entity

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AppConfig {
    @Bean
    open fun CinemaContainer(): CinemaContainer {
        return CinemaContainer()
    }
}
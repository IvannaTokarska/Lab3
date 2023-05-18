package ua.kpi.its.lab.rest.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate
@Entity
data class Movie(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

        var title: String,
        var country: String,
        val filmCompany: String,
        val duration: Int,
        val budget: Double,
        val premiereDate: LocalDate,
        val isRestricted: Boolean
)
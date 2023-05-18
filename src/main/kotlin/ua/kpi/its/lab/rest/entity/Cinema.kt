package ua.kpi.its.lab.rest.entity

import jakarta.persistence.*
import java.time.LocalDate

@Entity
data class Cinema(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

        var name: String,
        var address: String,
        val openingDate: LocalDate,
        val seatCount: Int,
        val screenCount: Int,
        val soundTechnology: String,
        val is3D: Boolean,

        @ManyToMany(fetch = FetchType.EAGER)
    val movies: MutableList<Movie> = mutableListOf()
)
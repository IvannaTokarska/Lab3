package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.dto.CinemaRequestDto
import ua.kpi.its.lab.rest.dto.CinemaResponseDto

interface CinemaService {

    fun getCinemaById(id: Long): CinemaResponseDto?
    fun createCinema(cinemaDto: CinemaRequestDto): CinemaResponseDto
    fun updateCinema(id: Long, cinemaDto: CinemaRequestDto): CinemaResponseDto?
    fun deleteCinema(id: Long): Boolean
}
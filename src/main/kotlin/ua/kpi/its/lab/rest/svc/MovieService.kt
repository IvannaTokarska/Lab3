package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.dto.MovieRequestDto
import ua.kpi.its.lab.rest.dto.MovieResponseDto

interface MovieService {

    fun getMovieById(id: Long): MovieResponseDto?
    fun createMovie(movieDto: MovieRequestDto): MovieResponseDto
    fun updateMovie(id: Long, movieDto: MovieRequestDto): MovieResponseDto?
    fun deleteMovie(id: Long): Boolean
}
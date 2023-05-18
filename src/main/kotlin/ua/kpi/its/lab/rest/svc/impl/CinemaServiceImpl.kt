package ua.kpi.its.lab.rest.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.dto.CinemaRequestDto
import ua.kpi.its.lab.rest.dto.CinemaResponseDto
import ua.kpi.its.lab.rest.entity.Cinema
import ua.kpi.its.lab.rest.svc.CinemaService
import ua.kpi.its.lab.rest.repository.CinemaRepository
import java.time.LocalDate

@Service
class CinemaServiceImpl(
    private val cinemaRepository: CinemaRepository
) : CinemaService {


    override fun createCinema(cinemaRequest: CinemaRequestDto): CinemaResponseDto {
        val cinemas = Cinema (name = cinemaRequest.name, address = cinemaRequest.address, openingDate = LocalDate.EPOCH, seatCount = cinemaRequest.seatCount, screenCount = cinemaRequest.screenCount, soundTechnology = cinemaRequest.soundTechnology, is3D = cinemaRequest.is3D)
        val savedCinemas = cinemaRepository.save(cinemas)
        return CinemaResponseDto.fromEntity(savedCinemas)
    }

    override fun getCinemaById(id: Long): CinemaResponseDto {
        val cinemas = cinemaRepository.findById(id).orElseThrow()
        return CinemaResponseDto.fromEntity(cinemas)
    }

    override fun updateCinema(id: Long, cinemaRequest: CinemaRequestDto): CinemaResponseDto {
        val cinemas = cinemaRepository.findById(id).orElseThrow()
        cinemas.name = cinemaRequest.name
        cinemas.address = cinemaRequest.address
        val updateCinemas = cinemaRepository.save(cinemas)
        return CinemaResponseDto.fromEntity(updateCinemas)
    }

    override fun deleteCinema(id: Long): Boolean {
        return if (cinemaRepository.existsById(id)) {
            cinemaRepository.deleteById(id)
            true
        } else {
            false
        }
    }
}
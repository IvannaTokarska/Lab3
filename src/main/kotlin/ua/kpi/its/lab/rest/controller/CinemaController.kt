package ua.kpi.its.lab.rest.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ua.kpi.its.lab.rest.dto.CinemaRequestDto
import ua.kpi.its.lab.rest.dto.CinemaResponseDto
import ua.kpi.its.lab.rest.svc.CinemaService
import java.net.URI

@RestController
@RequestMapping("/cinemas")
class CinemaController(private val cinemaService: CinemaService) {

    @GetMapping("/{id}")
    fun getCinemaById(@PathVariable id: Long): ResponseEntity<CinemaResponseDto> {
        val cinema = cinemaService.getCinemaById(id)
        return if (cinema != null) {
            ResponseEntity.ok(cinema)
        } else {
            ResponseEntity.notFound().build()
        }
    }
    @PostMapping
    fun createCinema(@RequestBody cinemaRequest: CinemaRequestDto): ResponseEntity<CinemaResponseDto> {
        val createdCinema = cinemaService.createCinema(cinemaRequest)
        return ResponseEntity.created(URI.create("/cinemas/${createdCinema.id}")).body(createdCinema)
    }

    @PutMapping("/{id}")
    fun updateCinema(
        @PathVariable id: Long,
        @RequestBody cinemaRequest: CinemaRequestDto
    ): ResponseEntity<CinemaResponseDto> {
        val updatedCinema = cinemaService.updateCinema(id, cinemaRequest)
        return if (updatedCinema != null) {
            ResponseEntity.ok(updatedCinema)
        } else {
            ResponseEntity.notFound().build()
        }
    }
    @DeleteMapping("/{id}")
    fun deleteCinema(@PathVariable id: Long): ResponseEntity<Boolean> {
        val deleted = cinemaService.deleteCinema(id)
        return if (deleted) {
            ResponseEntity.noContent().build()
        } else {
            ResponseEntity.notFound().build()
        }
    }

}
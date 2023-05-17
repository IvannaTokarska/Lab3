package ua.kpi.its.lab.rest.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ua.kpi.its.lab.rest.dto.ExampleRequest
import ua.kpi.its.lab.rest.dto.ExampleResponse
import ua.kpi.its.lab.rest.svc.ServiceExample

@RestController
class ExampleController @Autowired constructor(
    private val serviceExample: ServiceExample
) {
    @PostMapping("/example")
    fun createExample(@RequestBody request: ExampleRequest): ExampleResponse = serviceExample.createEntity(request)
}
package ua.kpi.its.lab.rest.svc

import ua.kpi.its.lab.rest.dto.ExampleRequest
import ua.kpi.its.lab.rest.dto.ExampleResponse

interface ServiceExample {
    fun createEntity(request: ExampleRequest): ExampleResponse
}
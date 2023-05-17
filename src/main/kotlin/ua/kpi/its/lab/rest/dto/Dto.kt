package ua.kpi.its.lab.rest.dto

data class ExampleRequest(
    var name: String
)

data class ExampleResponse(
    var id: Long,
    var name: String
)
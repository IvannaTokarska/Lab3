package ua.kpi.its.lab.rest.svc.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.dto.ExampleRequest
import ua.kpi.its.lab.rest.dto.ExampleResponse
import ua.kpi.its.lab.rest.entity.EntityExample
import ua.kpi.its.lab.rest.repository.RepositoryExample
import ua.kpi.its.lab.rest.svc.ServiceExample

@Service
class ServiceImpl @Autowired constructor(
    private val repositoryExample: RepositoryExample
): ServiceExample {
    override fun createEntity(request: ExampleRequest): ExampleResponse {
        val entity = EntityExample(name = request.name)
        val result = repositoryExample.save(entity)
        return ExampleResponse(result.id, result.name)
    }
}
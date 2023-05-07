package br.com.domy.example

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/v1/test")
class ExampleController(val repository: ExampleRepository) {

    @GetMapping
    fun getAll(): MutableIterable<ExampleEntity> {
        return repository.findAll()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postItem(@RequestBody exampleEntity: ExampleEntity): ExampleEntity {
        return repository.save(exampleEntity)
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteItem(@PathVariable id: Long) {
        repository.deleteById(id)
    }

    @GetMapping("/{id}")
    fun getItem(@PathVariable id: Long): Optional<ExampleEntity> {
        return repository.findById(id)
    }
}
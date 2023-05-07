package br.com.domy.example

import org.springframework.data.jpa.repository.JpaRepository

interface ExampleRepository: JpaRepository<ExampleEntity, Long> {
}
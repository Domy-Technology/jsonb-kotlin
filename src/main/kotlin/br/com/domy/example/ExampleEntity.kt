package br.com.domy.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
@Table(name = "example_table")
data class ExampleEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
    val name: String,
    @Column(name = "json_value") @JdbcTypeCode(SqlTypes.JSON) val data: JsonDataModel
) {
    constructor(): this(null, "", JsonDataModel())
}
package br.com.domy.example

import com.fasterxml.jackson.annotation.JsonProperty

data class JsonDataModel(
    @JsonProperty("name") var name: String?,
    @JsonProperty("description") var description: String?
) {
    constructor() : this(null,  null) {}
}
package com.example.webservice.domains.address.models.dto

import com.example.webservice.domains.common.base.models.dtos.BaseDto
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


class UnionDto : BaseDto() {
    @NotBlank
    @JsonProperty("name_en")
    var nameEn: String? = null

    @NotBlank
    @JsonProperty("name_bn")
    var nameBn: String? = null

    @NotNull
    @JsonProperty("upazila_id")
    var upazilaId: Long? = null
}




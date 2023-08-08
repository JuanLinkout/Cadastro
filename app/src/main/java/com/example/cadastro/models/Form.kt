package com.example.cadastro.models

class Form {
    var name: String? = null
    var phone: String? = null
    var email: String? = null
    var sex: String? = null
    var shouldReceiveNewsletter: String? = null
    var city: String? = null

    constructor(
        name: String?,
        phone: String?,
        email: String?,
        sex: String?,
        shouldReceiveNewsletter: String?,
        city: String?
    ) {
        this.name = name
        this.phone = phone
        this.email = email
        this.sex = sex
        this.shouldReceiveNewsletter = shouldReceiveNewsletter
        this.city = city
    }

    override fun toString(): String {
        return "Form(name=$name, phone=$phone, email=$email, sex=$sex, shouldReceiveNewsletter=$shouldReceiveNewsletter, city=$city)"
    }
}
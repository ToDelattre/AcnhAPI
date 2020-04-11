package com.todelattre

import com.todelattre.api.bugRoutes
import com.todelattre.api.fishRoutes
import io.javalin.Javalin
import io.javalin.apibuilder.ApiBuilder.path

fun main() {
    val app = Javalin.create().start(7000)

    app.routes {
        path("api") {
            fishRoutes()
            bugRoutes()
        }
    }
}


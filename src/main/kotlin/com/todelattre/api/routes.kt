package com.todelattre.api

import com.todelattre.dao.*
import io.javalin.apibuilder.ApiBuilder.get
import io.javalin.apibuilder.ApiBuilder.path
import kotlinx.coroutines.runBlocking

fun fishRoutes() =
    path("/fishes") {
        get("") { ctx -> runBlocking {
            ctx.json(
                findFishes(
                    ctx.queryParam("name"),
                    ctx.queryParam("rarity"),
                    ctx.queryParam("period"),
                    ctx.queryParam("hour"),
                    ctx.queryParam("location"),
                    ctx.queryParam("price")
                    )
                )
            }
        }
    }

fun insectRoutes() =
    path("/bugs") {
        get("") { ctx -> runBlocking {
            ctx.json(
                findBugs(
                    ctx.queryParam("name"),
                    ctx.queryParam("rarity"),
                    ctx.queryParam("period"),
                    ctx.queryParam("hour"),
                    ctx.queryParam("location"),
                    ctx.queryParam("price")
                )
            )
        }
        }
    }
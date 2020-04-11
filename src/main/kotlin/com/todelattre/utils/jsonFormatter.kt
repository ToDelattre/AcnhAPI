package com.todelattre.utils

import org.bson.Document

fun paramsToJson(
                 name: String?,
                 rarity: String?,
                 period: String?,
                 hour: String?,
                 location: String?,
                 sellPrice: String?
): String {
    val params: MutableList<String> = mutableListOf()

    name?.run { params.add("name: {\$regex: '$this'}") }
    rarity?.run { params.add("rarity: {\$in: ${this.split(",")}") }
    period?.run { params.add("months: {\$in: ${this.split(",")}}") }
    hour?.run { params.add("hours: {\$regex: '${this.split(",")}'}") }
    location?.run { params.add("location: {\$in: '${this.split(",")}'}") }
    sellPrice?.run { params.add("sellPrice: {\$gt: '${this.toInt()}'}") }

    println("{${params.joinToString(",")}}")
    return "{${params.joinToString(",")}}"
}
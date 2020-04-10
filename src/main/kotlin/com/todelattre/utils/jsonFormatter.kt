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

    name?.run { params.add("Nom: {\$regex: '$this'}") }
    rarity?.run { params.add("Rareté: {\$regex: '$this'}") }
    period?.run { params.add("Période: {\$in: ${this.split(",")}}") }
    hour?.run { params.add("Heure: {\$regex: '${this.split(",")}'}") }
    location?.run { params.add("Lieu: {\$in: '${this.split(",")}'}") }
    sellPrice?.run { params.add("Nom: {\$gt: '${this.toInt()}'}") }

    println("{${params.joinToString(",")}}")
    return "{${params.joinToString(",")}}"
}
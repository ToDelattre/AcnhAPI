package com.todelattre.dao

import com.todelattre.clients.database
import com.todelattre.utils.paramsToJson
import org.bson.Document
import org.litote.kmongo.coroutine.toList

/**
 * Fishes collection containing all the information about fishes
 */
val bugs = database.getCollection("Insects")

suspend fun findBugs(
    name: String?,
    rarity: String?,
    period: String?,
    hour: String?,
    location: String?,
    sellPrice: String?
): List<Document> {
    val filter = Document.parse(paramsToJson(name, rarity, period, hour, location, sellPrice))
    return bugs.find(filter).toList()
}
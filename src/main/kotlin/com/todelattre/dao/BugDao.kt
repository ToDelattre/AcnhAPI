package com.todelattre.dao

import com.todelattre.clients.database
import com.todelattre.utils.paramsToJson
import org.bson.Document
import org.litote.kmongo.coroutine.toList

/**
 * Bugs collection containing all the information about bugs
 */
val bugs = database.getCollection("Bugs")

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
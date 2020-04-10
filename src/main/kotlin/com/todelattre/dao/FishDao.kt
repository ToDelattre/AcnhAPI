package com.todelattre.dao

import com.mongodb.reactivestreams.client.MongoCollection
import com.todelattre.clients.database
import com.todelattre.utils.paramsToJson
import org.bson.Document
import org.litote.kmongo.coroutine.toList

/**
 * Fishes collection containing all the information about fishes
 */
val fishes: MongoCollection<Document> = database.getCollection("Fishes")

suspend fun getAllFishes(): List<Document> {
    println("Getting all existing fishes.")
    return fishes.find().toList()
}

suspend fun findFishes(
    name: String?,
    rarity: String?,
    period: String?,
    hour: String?,
    location: String?,
    sellPrice: String?
): List<Document> {
    val filter = Document.parse(paramsToJson(name, rarity, period, hour, location, sellPrice))
    return fishes.find(filter).toList()
}


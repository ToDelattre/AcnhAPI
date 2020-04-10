package com.todelattre.clients

import org.litote.kmongo.reactivestreams.KMongo

val client = KMongo.createClient("mongodb+srv://admin:admin@cluster0-fvlun.mongodb.net/test?authSource=admin&replicaSet=Cluster0-shard-0&readPreference=primary&appname=MongoDB%20Compass&ssl=true")
val database = client.getDatabase("acnhAPI")
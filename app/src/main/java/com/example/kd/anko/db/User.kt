package com.example.kd.anko.db

/**
 * Created by shiwei on 2017/8/10.
 */
data class User(val map: MutableMap<String, Any?>) {
    var id: Long by map
    var name: String by map
    var age: Int by map

    constructor(id: Long, name: String, age: Int) : this(HashMap()) {
        this.id = id
        this.name = name
        this.age = age
    }
}
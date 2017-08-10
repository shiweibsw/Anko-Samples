package com.example.kd.anko.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.example.kd.anko.App
import org.jetbrains.anko.db.*

/**
 * Created by shiwei on 2017/8/10.
 */
class MyDatabaseOpenHelper(ctx: Context = App.instance) : ManagedSQLiteOpenHelper(ctx, DB_NAME, null, DB_VERSION) {
    companion object {
        val DB_NAME = "mydatabase.db"
        val DB_VERSION = 2
        val instance by lazy { MyDatabaseOpenHelper() }
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.createTable("User", true,
                "id" to INTEGER + PRIMARY_KEY + AUTOINCREMENT ,
                "name" to TEXT,
                "age" to INTEGER)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.dropTable("User", true)
        onCreate(db)
    }
}

val Context.database: MyDatabaseOpenHelper
    get() = MyDatabaseOpenHelper.instance
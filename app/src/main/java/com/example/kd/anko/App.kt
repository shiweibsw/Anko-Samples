package com.example.kd.anko

import android.app.Application
import com.antonioleiva.weatherapp.extensions.DelegatesExt
import com.example.kd.anko.db.MyDatabaseOpenHelper

/**
 * Created by shiwei on 2017/8/10.
 */
class App : Application() {
    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}
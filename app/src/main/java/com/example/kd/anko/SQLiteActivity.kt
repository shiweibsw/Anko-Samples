package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.antonioleiva.weatherapp.extensions.parseOpt
import com.example.kd.anko.db.User
import com.example.kd.anko.db.database
import kotlinx.android.synthetic.main.activity_sqlite.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.db.insert
import org.jetbrains.anko.db.select
import org.jetbrains.anko.db.update
import org.jetbrains.anko.info

class SQLiteActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)

        button.setOnClickListener {
            database.use {
                insert("User", "name" to "John", "age" to 20)
            }
        }
        button2.setOnClickListener {
            database.use {
            }
        }
        button3.setOnClickListener {
            database.use {
                update("User", "name" to "alice").whereSimple("id = ?", "2").exec()
            }
        }
        button4.setOnClickListener {
            database.use {
                var u = select("User", "name").whereSimple("name like ? and id = ?", "%j%","1").parseOpt { User(HashMap(it)) }
                info { "user name is:${u?.name}" }
            }
        }

    }
}

package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_logging.*
import org.jetbrains.anko.*

class LoggingActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logging)
        verbose.setOnClickListener { verbose { "I'm verbose logger" } }
        debug.setOnClickListener { debug { "I'm debug logger" } }
        info.setOnClickListener { info { "I'm info logger" } }
        warn.setOnClickListener { warn { "I'm warn logger" } }
        error.setOnClickListener { error { "I'm error logger" } }
    }
}

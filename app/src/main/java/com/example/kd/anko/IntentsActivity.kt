package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.kd.anko.adapter.IntentsAdapter
import kotlinx.android.synthetic.main.activity_intents.*
import org.jetbrains.anko.*

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)
        title = "Intents"
        mRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecycler.adapter = IntentsAdapter() {
            when (it) {
                0 -> {
                    startActivity<IntentDetailsActivity>()
                }
                1 -> {
                    startActivity<IntentDetailsActivity>(IntentDetailsActivity.ID to 1)
                }
                2 -> {
                    makeCall("123456789")//need CALL_PHONE permission
                }
                3 -> {
                    sendSMS("123456789", "messsage")
                }
                4 -> {
                    browse("https://github.com/shiweibsw/Anko-Samples")
                }
                5 -> {
                    share("content", "subject")
                }
                6 -> {
                    email("shiwei.bsw@gmail.com", "subject", "content")
                }
            }
        }
    }
}

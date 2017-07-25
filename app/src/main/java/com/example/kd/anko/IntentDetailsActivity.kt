package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_intent_details.*

class IntentDetailsActivity : AppCompatActivity() {
    companion object {
        var ID = "IntentDetailsActivity:ID"
    }

    var id = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_details)
        title = "Intent Details"
        id = intent.getIntExtra(ID, -1)
        if (id!=-1){
            tv.text="Current parameter is $id"
        }
    }
}

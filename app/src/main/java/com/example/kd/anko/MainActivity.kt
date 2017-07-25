package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.kd.anko.adapter.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecycler.adapter = MainAdapter() {
            when(it){
                0->{startActivity<DialogsActivity>()}
                1->{startActivity<IntentsActivity>()}
                2->{startActivity<LoggingActivity>()}
                3->{startActivity<MiscActivity>()}
                4->{startActivity<SQLiteActivity>()}
            }
        }
    }
}

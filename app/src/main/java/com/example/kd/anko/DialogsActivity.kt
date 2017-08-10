package com.example.kd.anko

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.kd.anko.adapter.DialogsAdapter
import kotlinx.android.synthetic.main.activity_dialogs.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.progressDialog
import org.jetbrains.anko.toast

class DialogsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialogs)
        title = "Dialogs"
        mRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mRecycler.adapter = DialogsAdapter() {
            when (it) {
                0 -> {
                    toast("I'm a short toast")
                }
                1 -> {
                    longToast("I'm a long toast")
                }
                2 -> {
//                    alert("Alert message", "Alert title") {
//                        positiveButton("Confirm") { dialog -> dialog.dismiss() }
//                        negativeButton("Cancel") { dialog -> dialog.dismiss() }
//                    }.show()
                }
                3 -> {
//                    val langs = listOf("Kotlin", "Java", "Php", "Go")
//                    selector("Which language are you Learning?", langs, { dialogInterface, i ->
//                        toast("You have chosen ${langs[i]}")
//                    })
                }
                4 -> {
                    val dialog = progressDialog(title = "Loading")
                    dialog.show()
                }
            }
        }
    }
}

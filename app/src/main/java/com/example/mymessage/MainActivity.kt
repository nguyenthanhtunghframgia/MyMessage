package com.example.mymessage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.crashlytics.android.Crashlytics
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_hello.setOnClickListener {
            Crashlytics.getInstance().crash()
        }
    }
}

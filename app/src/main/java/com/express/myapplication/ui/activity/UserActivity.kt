package com.express.myapplication.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.express.myapplication.R
import com.express.myapplication.ui.activity.UserActivity.Const.ARG_1
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        var userName : String ?= null
        intent.let {
           val bundle = intent.extras
            userName = bundle?.getString(ARG_1)
        }

        username?.text = userName.toString();
    }

    object Const {
        const val ARG_1 = "user_name"
    }
}

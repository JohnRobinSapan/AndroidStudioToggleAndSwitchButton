package com.example.toggleandswitchbutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var toast : Toast? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggleButton.setOnCheckedChangeListener {compoundButton, isChecked ->

            if (isChecked) {
                showToast("Toggle on")
                root_layout.setBackgroundColor(Color.MAGENTA)
            } else {
                showToast("Toggle off")
                root_layout.setBackgroundColor(Color.WHITE)
            }
        switchButton.setOnCheckedChangeListener { compundButton, onSwitch ->
            if (onSwitch) {
                switchButton.setBackgroundColor(Color.GREEN)
            } else {
                switchButton.setBackgroundColor(Color.RED)
            }

        }

        }
    }

    private fun showToast(text: String) {
        if(toast != null) {
            toast?.cancel()
        }
        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)

        toast?.setGravity(Gravity.TOP, 0, 200)
        toast?.show()
    }
}

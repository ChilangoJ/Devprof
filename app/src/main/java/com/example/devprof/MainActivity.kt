package com.example.devprof

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity(val logo: Unit) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.devslopesprofilelogo)
        val rounded = RoundedBitmapDrawableFactory.create(resources, bitmap)
        rounded.cornerRadius = 15f
        rounded.isCircular = true
        logo.setImageDrawable(rounded)

    }
}

private fun Unit.setImageDrawable(rounded: RoundedBitmapDrawable) {

}

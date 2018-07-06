package com.example.sanjeev.errorcheck

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

//https://andfun-weather.udacity.com/weather
//https://jsonformatter.curiousconcept.com/
//https://openweathermap.org/api
class MainActivity : AppCompatActivity() {
    TextView textView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

package com.example.imadpracticum

import android.widget.EditText
import android.widget.Toast

class DetailedScreenActivity {


    private lateinit var dayEditText: EditText
    private lateinit var minimumTemperatureEditText: EditText
    private lateinit var maximumTemperatureEditText: EditText
    private lateinit var weatherConditionEditText: EditText
    private var day= ArrayList<String>()
    private var minimumTemperature= ArrayList<Int>()
    private var maximumTemperature= ArrayList<Int>()
    private var weatherCondition= ArrayList<String>()

    override fun oncreate(savedInstanceState: Bundle?){
        super.onCreate(SavedInstanceStates)
        enableEdgetoEdge()
        setContentView(R.layout.activity_main_screen)override fun on create(savedInstanceState: Bundle?){

            dayEditText= findVIiewById(R.id.dayEditText)
            minimumTemperatureEditText= findViewById(R.id.minimumTemperatureEditText)
            maximumTemperatureEditText= findViewById(R.id.maximumTemperatureEditText)
            weatherConditionEditText= findViewById(R.id.weatherConditionEditText)

            addButton.setOnClickLiastener{
                addScreenTime()
            }

            clearButton.setOnClickListener{
                clearData()
            }
            detailedViewButton.setOnClickListener{
                val intent = Intent(this, detailedViewScreenActivity::class.java)
                intent.putStringArrayListenerExtra("day", days)
                intent.putIntegerArrayListExtra("minimumTemperature", minimumTemperature )
                intent.putIntergerArrayListExtra("maximumTemperature", maximumTemperature)
                startActivity(inent)

                private fun addTemperature(){
                    val day = dayEditText.text.toString()
                    val minimumTemperature = minimumTemperatureEditText.text.toString().toIntOrNull()
                    val maximumTemperature  = maximumTemperatureEditText.text.toString().toIntOrNull()
                    val weatherCondition = weatherConditionEditText.text.toString()


                }
                if (day,isNotEmpty() && minimumTemperature !=null && maximumTemperature !=null){
                days.add(day)
                minimumTemperature.add(minimumTemperature)
                maximumTemperature


                dayEditText.text.clear()
                minimumTemperatureEditText.text.clear()
                maximumTemperatureEditText.text.clear()
                weatherConditionEditText.text.clear()

                Toast.makeText(this, "Data loaded successfully", Toast.LENGTH_SHORT)()
            }



            private fun clearData(){
                day.clear()
                minimumTemperature.clear()
                maximumTemperature.clear()
                weatherCondition.clear()

                dayEditText.text.clear()
                minimumTemperatureEditText.text.clear()
                maximumTemperatureEditText.text.clear()
                weatherConditionEditText.text.clear()

                Toast.makeText(this,"Data cleared ", Toast.LENGTGH_SHORT)show()
            }
        }

    }









}
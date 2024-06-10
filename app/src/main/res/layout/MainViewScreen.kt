package layout

import android.os.Bundle
import android.widget.TextView

class MainViewScreen {


    private lateinit var detailsTextView: TextView
    private lateinit var averageTextView: TextView
    private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)


        detailsTextView = findViewById(R.id.detailsTextView)
        averageTextView = findViewById(R.id.averageTextView)
        backButton = findViewById(R.id.backButton)

        val day = intent.getStringArrayListExtra("day") ?: arrayListOf()
        val minimumTemperature = intent.getStringArrayListExtra("minimumTemperature") ?: arrayListOf()
        val maximumTemperature = intent.getStringArrayListExtra("maximumTemperature") ?: arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions")

        val details = StringBuilder()
        var totalScreenTime = 0
        for (i in dates.indices){
            details.append("${dates[1]}: Minimum - ${minimumTemperature{i} degrees, maximim" + "${maximumTemperature[1]} degrees, Condition ${weatherCondition[i]}\n")

            }
}
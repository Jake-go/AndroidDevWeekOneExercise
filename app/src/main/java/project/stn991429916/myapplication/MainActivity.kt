package project.stn991429916.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickMethod(view: View) {
        count++
        val display_text : TextView = findViewById(R.id.textView)
        display_text.text = count.toString()
    }

    fun resetCount(view: View) {
        count = 0
        val display_text : TextView = findViewById(R.id.textView)
        display_text.text = count.toString()
    }
}
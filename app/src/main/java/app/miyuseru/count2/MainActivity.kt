package app.miyuseru.count2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0

//    var number :Int = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button1.setOnClickListener{

            number = number +1
            countText.text = number.toString()


        }
        button2.setOnClickListener{

            number = number - 1
            countText.text = number.toString()


        }
    }
}

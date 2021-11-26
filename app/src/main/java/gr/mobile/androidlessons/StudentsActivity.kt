package gr.mobile.androidlessons

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_studens.*

class StudentsActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studens)

        studens_go_main_btn.setOnClickListener {
            finish()
        }


    }

}

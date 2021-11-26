package gr.mobile.androidlessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    // First way to access xml views
 //  private var name: AppCompatTextView? = null
 //   private var color: AppCompatTextView? = null
  //  private var salary: AppCompatTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

  //      name = findViewById((R.id.name))
 //       color = findViewById((R.id.color)) //     salary = findViewById((R.id.salary))
//

        //Give value to xml text views
        name.text = "Mariam Chozavri"
        color.text = "Red"
        salary.text = "300"
        //if salary has value less than 500 the hide this field

        if(salary.text.toString().toInt() > 500){
            salary.visibility = View.VISIBLE
        }else {
            salary.visibility = View.GONE
        }


        val name = button.text.toString() // (Zisis)
        when(salary.text.toString().toInt()){
            in 300..499 -> {
                Toast.makeText(this, "Salary low", Toast.LENGTH_LONG).show()

            }
            in 500..699 -> {
                Toast.makeText(this, "Salary medium", Toast.LENGTH_LONG).show()

            }
            in 700..1000 ->{
                Toast.makeText(this, "Salary basic", Toast.LENGTH_LONG).show()

            }
            else ->{
                Toast.makeText(this, "No name found", Toast.LENGTH_LONG).show()
            }
        }

        // Add click LIstener to button view
     //   button.setOnClickListener {
     //       Toast.makeText(this, "Button Pressed By ${button.text}", Toast.LENGTH_LONG).show()
      //  }

        //The color you is Red
        colorTitle.setOnClickListener {
            Toast.makeText(this, "The color you click is  ${color.text}", Toast.LENGTH_LONG).show()
        }

        //Click that goes me to next screen. For Example navigate me to SecondActivity
        button.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))

        }

        studens_btn.setOnClickListener {
            startActivity(Intent(this, StudentsActivity::class.java))
        }







  //      // Second way to access xml views
   //      name.text = "Mariam Chozavri"
  //       color.text = "Red"
  //       salary.text = "1.500 euro"




    }
}
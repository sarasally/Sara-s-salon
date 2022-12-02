package com.example.sarassalon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var wa:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1: Button =findViewById(R.id.button3)
        val rb: RadioGroup =findViewById(R.id.radio_group)
        val t:TextView=findViewById(R.id.tot)
        var total:Int=0
        b1.setOnClickListener{
            val selectId:Int=rb.checkedRadioButtonId
            val r: RadioButton =findViewById(selectId)
           if(r.text=="Haircut  15JD"){
               if(wa==15){
                   total=0
                   wa=0
                   t.text="total= 0 JOD "

               }
               else if(wa>15){
                   wa =wa- 15
                   t.text="total= 0 JOD "

               }

               else{
                   total=15-wa
                   wa=0
                   t.text="total= "+total+" JOD "

               }

        }
          else if(r.text=="Facial  20JD"){
                if(wa==20){
                    wa=0
                    total=0
                    t.text="total= 0 JOD "

                }
                else if(wa>20){
                    wa =wa- 20
                    t.text="total= 0 JOD "

                }

                else{
                    total=20-wa
                    wa=0
                    t.text="total= "+total+" JOD "

                }
            }
           else if(r.text=="Makeup  40JD"){
               if(wa==40){
                   wa=0
                   total=0
                   t.text="total= 0 JOD "

               }
               else if(wa>40){
                   wa -= 40
                   t.text="total= 0 JOD "

               }

               else{
                   total=40-wa
                   wa=0
                   t.text="total= "+total+" JOD "

               }
           }
           else if(r.text=="Haircolor  50JD") {
               if(wa==50){
                   wa=0
                   total=0
                   t.text="total= 0 JOD "

               }
               else if(wa>50){
                   wa -= 50
                   t.text="total= 0 JOD "

               }

               else{
                   total=50-wa
                   wa=0
                   t.text="total= "+total+" JOD "

               }
           }
           else if(r.text=="Bridal  100JD")  {
               if(wa==100){
                   wa=0
                   total=0
                   t.text="total= 0 JOD "

               }
               else if(wa>100){
                   wa -= 100
                   t.text="total= 0 JOD "

               }

               else{
                   total=100-wa
                   wa=0
                   t.text="total= "+total+" JOD "

               }
           }


    }}
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //inflate the menu to use in the action bar
        val inflater=menuInflater
        inflater.inflate(R.menu.example_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->{
                val d = SaraDialog()
                d.show(supportFragmentManager,"sara")
            }


            R.id.item2->{

                val d = SallyDialog()
                d.show(supportFragmentManager,"sally")

            }
        }


        return true
    }





    fun recieve_text(text1:String){
        wa=text1.toInt()
    }



}
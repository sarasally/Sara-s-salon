
    package com.example.sarassalon

    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.EditText
    import android.widget.TextView
    import androidx.fragment.app.DialogFragment

    class SaraDialog: DialogFragment(R.layout.dialog_sara) {

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            val b1: Button = view.findViewById(R.id.button2)
            val b2: Button = view.findViewById(R.id.button4)
            val t1: TextView =view.findViewById(R.id.textView2)
            val sar:EditText =view.findViewById(R.id.e4)
            b1.setOnClickListener{view->

                var x:Int=sar.text.toString().toInt()
                var y:Int=t1.text.toString().toInt()
                val m1:MainActivity= getActivity() as MainActivity
                var w:Int=x+y
                m1.recieve_text(w.toString())
                t1.text=w.toString()

            }
            b2.setOnClickListener{

                dismiss()
            }


        }


    }








package com.malkinfo.sendnotificationmassage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var sendBtn:ImageButton
    private lateinit var msg:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendBtn = findViewById(R.id.sendBtn)
        msg = findViewById(R.id.userMassage)
        sendBtn.setOnClickListener {
            NotificationHelper(this,msg.text.toString()).Notification()
            /**KeyBord Hide*/
            val kh = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            kh.hideSoftInputFromWindow(currentFocus?.windowToken,0)
            /**ok set Text msg*/
            Toast.makeText(this,"${msg.text} is send",Toast.LENGTH_SHORT).show()
        }

    }
    /**ok now run it*/
}
package co.com.vince.platzigramkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import co.com.vince.platzigramkotlin.view.CreateAccountActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }


    fun goCreateAccount(v: View) {
        var intent: Intent = Intent(baseContext, CreateAccountActivity::class.java)
        startActivity(intent)
    }
}

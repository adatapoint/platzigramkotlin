package co.com.vince.platzigramkotlin.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.com.vince.platzigramkotlin.R
import kotlinx.android.synthetic.main.actionbar_toolbar.*

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        toolbarConfig(resources.getString(R.string.create_account), true)


    }

    private fun toolbarConfig(title: String, upButton: Boolean) {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = title
        supportActionBar!!.setDisplayHomeAsUpEnabled(upButton)
    }

}

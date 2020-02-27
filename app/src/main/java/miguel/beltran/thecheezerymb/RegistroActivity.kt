package miguel.beltran.thecheezerymb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*

class RegistroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        btn_registro.setOnClickListener({
            val intent= Intent(this,MenuActivity::class.java)
            startActivity(intent)
        })
    }
}

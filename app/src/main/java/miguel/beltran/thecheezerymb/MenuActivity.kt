package miguel.beltran.thecheezerymb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu_registro.*
import kotlinx.android.synthetic.main.activity_registro.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_registro)

        btn_coldDrink.setOnClickListener({
            val intent= Intent(this,Pantalla1::class.java)
            startActivity(intent)
        })
        btn_hotDrink.setOnClickListener({
            val intent= Intent(this,Pantalla2::class.java)
            startActivity(intent)
        })
        btn_sweets.setOnClickListener({
            val intent= Intent(this,Pantalla3::class.java)
            startActivity(intent)
        })
        btn_salties.setOnClickListener({
            val intent= Intent(this,Pantalla4::class.java)
            startActivity(intent)
        })
        btn_combos.setOnClickListener({
            val intent= Intent(this,Pantalla5::class.java)
            startActivity(intent)
        })
        btn_personalized.setOnClickListener({
            val intent= Intent(this,Pantalla6::class.java)
            startActivity(intent)
        })
    }
}

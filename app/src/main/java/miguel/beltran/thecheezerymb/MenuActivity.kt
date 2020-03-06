package miguel.beltran.thecheezerymb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu_registro.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_registro)

        btn_coldDrink.setOnClickListener {
            startActivity(intent)
            val intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton","coldDrinks")
            startActivity(intent)
        }
        btn_hotDrink.setOnClickListener {
            val intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton","hotDrinks")
            startActivity(intent)
        }
        btn_sweets.setOnClickListener {
            val intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton","sweets")
            startActivity(intent)
        }
        btn_salties.setOnClickListener {
            val intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton","salties")
            startActivity(intent)
        }
        btn_combos.setOnClickListener {
            val intent= Intent(this,CombosActivity::class.java)
            startActivity(intent)
        }
        btn_personalized.setOnClickListener {
            val intent= Intent(this,ProductosActivity::class.java)
            intent.putExtra("boton","perzonalized")
            startActivity(intent)
        }
    }
}

package miguel.beltran.thecheezerymb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_combos.*
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class CombosActivity : AppCompatActivity() {

    var listaProductos=ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_combos)
        cargarCombos()
        var adaptador=AdaptadorProductos(this, listaProductos)
        gridview_Combos.adapter=adaptador
    }

    fun cargarCombos(){
        listaProductos.add(Product("Cappuccino & Sandwich", R.drawable.cappuccinosub, "Medium sandwich sub accompanied with cappuccino", 7))
        listaProductos.add(Product("Fajita Nachos", R.drawable.fajitanachos, "Fajita nachos topped with sour cream and guacamole accompanied with orange juice", 8))
        listaProductos.add(Product("Healthy breakfast", R.drawable.fruitsandtoast, "Fresh sliced fruis, egg and guacamole toast accompanied with orange juice.", 9))
        listaProductos.add(Product("Salties & Sweets", R.drawable.fruitssaladsweets, "Mix of sandwiches, sliced fruits fresh salad and a variety of sweets.", 13))
        listaProductos.add(Product("Sandwich & Milkshake", R.drawable.sandwichmilkshake, "Grilled cheese sandwich and a milkshake.",  7))
    }

    private class AdaptadorProductos: BaseAdapter {

        var productos=ArrayList<Product>()
        var contexto: Context?=null

        constructor(contexto: Context, productos:ArrayList<Product>){
            this.contexto=contexto
            this.productos=productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var producto=productos[position]
            var inflador= LayoutInflater.from(contexto)
            var vista=inflador.inflate(R.layout.producto_view,null)

            vista.producto_img.setImageResource(producto.image)
            vista.producto_nombre.setText(producto.name)
            vista.producto_desc.setText(producto.description)
            vista.producto_precio.setText("$${producto.price}")
            return vista
        }

        override fun getItem(position: Int): Any {
            return productos[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return productos.size
        }

    }
}

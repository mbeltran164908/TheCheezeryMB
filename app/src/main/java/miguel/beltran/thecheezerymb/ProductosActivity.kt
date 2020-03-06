package miguel.beltran.thecheezerymb

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_productos.*
import kotlinx.android.synthetic.main.producto_view.view.*

class ProductosActivity : AppCompatActivity() {

    var listaProductos=ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        when(getIntent().getStringExtra("boton")){
            "coldDrinks" ->{
                img_productos.setImageResource(R.drawable.colddrinks)
                cargarColdDrinks()
            }
            "hotDrinks"->{
                img_productos.setImageResource(R.drawable.hotdrinks)
                cargarHotDrinks()
            }
            "sweets"->{
                img_productos.setImageResource(R.drawable.sweets)
                cargarSweets()
            }
            "salties"->{
                img_productos.setImageResource(R.drawable.salties)
                cargarSalties()
            }
            else->{
                img_productos.setImageResource(R.drawable.colddrinks)
                cargarColdDrinks()
            }
        }
        var adaptador=AdaptadorProductos(this,listaProductos)
        listview.adapter=adaptador
    }

    fun cargarColdDrinks(){
        listaProductos.add(Product("Caramel Frap", R.drawable.caramelfrap, "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", 5))
        listaProductos.add(Product("Chocolate Frap", R.drawable.chocolatefrap, "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", 6))
        listaProductos.add(Product("Cold Brew", R.drawable.coldbrew, "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", 3))
        listaProductos.add(Product("Matcha Latte", R.drawable.matcha, "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", 4))
        listaProductos.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", 7))
        listaProductos.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7))
    }
    
    fun cargarHotDrinks(){
        listaProductos.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6))
        listaProductos.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5))
        listaProductos.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4))
        listaProductos.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6))
        listaProductos.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7))
        listaProductos.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2))
    }

    fun cargarSweets(){
        listaProductos.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6))
        listaProductos.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3))
        listaProductos.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4))
        listaProductos.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6))
        listaProductos.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7))
        listaProductos.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6))
    }
    
    fun cargarSalties(){
        listaProductos.add(Product("Chicken crepes", R.drawable.chickencrepes, "Fine crepes stuffed with Alfredo chicken, spinach and mushrooms.", 6))
        listaProductos.add(Product("Club Sandwich", R.drawable.clubsandwich, "A delicious sandwich served with french fries.", 5))
        listaProductos.add(Product("Panini", R.drawable.hampanini, "Sandwich made with Italian bread  served warmed by grilling.", 4))
        listaProductos.add(Product("Philly cheese steak", R.drawable. phillycheesesteak, "Smothered in grilled onions, green peppers, mushrooms, and Provolone.", 6))
        listaProductos.add(Product("Nachos", R.drawable. nachos, "Tortilla chips layered with beef and   melted cheddar cheese. Served with fried beans, guacamole, pico de gallo, and sour topping.",  7))
    }

    private class AdaptadorProductos:BaseAdapter{

        var productos=ArrayList<Product>()
        var contexto:Context?=null

        constructor(contexto:Context,productos:ArrayList<Product>){
            this.contexto=contexto
            this.productos=productos
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var producto=productos[position]
            var inflador=LayoutInflater.from(contexto)
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

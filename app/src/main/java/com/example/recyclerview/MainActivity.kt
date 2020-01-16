package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.ShoesAdapter
import com.example.recyclerview.model.Shoes

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView = findViewById(R.id.shoes_recycler)

        val shoeArray = ArrayList<Shoes>()
        shoeArray.add(Shoes("Shoe1", "Thailand", "$ 100", R.drawable.shoe1))
        shoeArray.add(Shoes("Shoe2", "China", "$ 20", R.drawable.shoe2))
        shoeArray.add(Shoes("Shoe3", "Myanmar", "$ 10", R.drawable.shoe3))
        shoeArray.add(Shoes("Shoe4", "Korea", "$ 35", R.drawable.shoe4))
        shoeArray.add(Shoes("Shoe5", "Thailand", "$ 35", R.drawable.shoe5))
        shoeArray.add(Shoes("Shoe6", "Singapore", "$ 36", R.drawable.shoe6))
        shoeArray.add(Shoes("Shoe1", "Thailand", "$ 100", R.drawable.shoe1))
        shoeArray.add(Shoes("Shoe2", "China", "$ 20", R.drawable.shoe2))
        shoeArray.add(Shoes("Shoe3", "Myanmar", "$ 10", R.drawable.shoe3))
        shoeArray.add(Shoes("Shoe4", "Korea", "$ 35", R.drawable.shoe4))
        shoeArray.add(Shoes("Shoe5", "Thailand", "$ 35", R.drawable.shoe5))
        shoeArray.add(Shoes("Shoe6", "Singapore", "$ 36", R.drawable.shoe6))

        val shoesAdapter = ShoesAdapter(shoeArray)

        //recyclerView.layoutManager=LinearLayoutManager(this)
        // recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = shoesAdapter

    }
}

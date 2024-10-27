package com.beyzanurcelebi.superkahramanlar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.beyzanurcelebi.superkahramanlar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var superKahramanListesi : ArrayList<SuperKahraman>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val superman = SuperKahraman("Superman","Gazeteci",R.drawable.superman)
        val batman = SuperKahraman("Batman","Patron",R.drawable.batman)
        val ironman = SuperKahraman("IronMan","Holding Sahibi",R.drawable.ironman)
        val spiderman = SuperKahraman("SpiderMan","Öğrenci",R.drawable.spiderman)

        superKahramanListesi = arrayListOf(superman,batman,ironman,spiderman)

//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)
//        superKahramanListesi.add(superman)




        val adapter = SuperKahramanAdapter(superKahramanListesi) //maindeki listeye adapterdan ulasmak icin

        binding.superKahramanRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.superKahramanRecyclerView.adapter= adapter


    }
}
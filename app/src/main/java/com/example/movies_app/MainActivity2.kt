package com.example.movies_app

import Movie_Item
import MyAdapter
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
   //lateinit var  welcomeMsg : TextView
    //val username = intent.getStringExtra("USERNAME_KEY")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val recyclerView: RecyclerView = findViewById(R.id.myRecycler)

       //welcomeMsg=findViewById(R.id.msg)
        //welcomeMsg.text="Welcome $username!"

        val movieList = listOf(
            Movie_Item(
                "Inside Out 2",
                "A sequel to the animated movie exploring emotions in a teenage girl.",
                "Directed by Kelsey Mann, this movie continues the journey inside Riley's mind.",
                "2024",
                4.5,
                R.drawable.insideout2
            ),
            Movie_Item(
                "Little Women",
                "A heartfelt story of four sisters navigating life, love, and independence.",
                "Directed by Greta Gerwig, starring Saoirse Ronan, Emma Watson, Florence Pugh, and Eliza Scanlen.",
                "2019",
                4.7,
                R.drawable.little_women
            ),
            Movie_Item(
                "The Space Between Us",
                "A romantic sci-fi story of a boy born on Mars who visits Earth for the first time.",
                "Directed by Peter Chelsom, starring Asa Butterfield and Britt Robertson.",
                "2017",
                3.9,
                R.drawable.the_space_between_us
            ),
            Movie_Item(
                "Coco",
                "A young boy ventures into the Land of the Dead to discover his family's history.",
                "Directed by Lee Unkrich and Adrian Molina.",
                "2017",
                4.7,
                R.drawable.coco
            ),
            Movie_Item(
                "La La Land",
                "A musical romance between a jazz musician and an aspiring actress.",
                "Directed by Damien Chazelle, starring Ryan Gosling and Emma Stone.",
                "2016",
                4.8,
                R.drawable.la_la_land
            ),
            Movie_Item(
                "Inside Out",
                "A heartfelt animation about emotions inside a young girl's mind.",
                "Directed by Pete Docter, produced by Pixar Animation Studios.",
                "2015",
                4.8,
                R.drawable.insideout
            ),
            Movie_Item(
                "Shutter Island",
                "A mystery thriller about a U.S. Marshal investigating a disappearance on an island.",
                "Directed by Martin Scorsese, starring Leonardo DiCaprio.",
                "2010",
                4.2,
                R.drawable.shutter_island
            ),
            Movie_Item(
                "Sherlock Holmes",
                "A detective adventure where Holmes and Watson solve a deadly conspiracy.",
                "Directed by Guy Ritchie, starring Robert Downey Jr. and Jude Law.",
                "2009",
                4.3,
                R.drawable.sherlock_holmes
            ),

            Movie_Item(
                "The Pride and Prejudice",
                "A classic romantic drama about Elizabeth Bennet and Mr. Darcy.",
                "Directed by Joe Wright, based on the novel by Jane Austen.",
                "2005",
                4.6,
                R.drawable.pride_and_prejudice
            ),
            Movie_Item(
                "You've Got Mail",
                "A romantic comedy about two business rivals unknowingly falling in love online.",
                "Directed by Nora Ephron, starring Tom Hanks and Meg Ryan.",
                "1998",
                4.0,
                R.drawable.youve_got_mail
            )


        )



        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(movieList)
        //Log.d("MainActivity", "Movie list size: ${movieList.size}")
        //for (movie in movieList) {
          //  Log.d("MainActivity", "Movie: ${movie.name}, Year: ${movie.puplishedDate}, Rate: ${movie.rate}")
        //}
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            finishAffinity() // Ends all activities in the current task
            System.exit(0)   // Ensures the app process is terminated
        }
            })
    }
}
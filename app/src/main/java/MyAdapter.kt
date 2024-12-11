import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movies_app.R

class MyAdapter(private val movies: List<Movie_Item>) : RecyclerView.Adapter<MyAdapter.MovieViewHolder>() {

        // ViewHolder to hold references to item views
        class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val movieImage: ImageView = itemView.findViewById(R.id.movieImage)
            val movieTitle: TextView = itemView.findViewById(R.id.movieTitle)
            val movieDescription : TextView = itemView.findViewById(R.id.movieDescription)
            val movieDetails : TextView = itemView.findViewById(R.id.movieDetails)
            val movieDate: TextView = itemView.findViewById(R.id.movieDate)
            val movieRate: TextView = itemView.findViewById(R.id.movieRate)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item, parent, false)
            return MovieViewHolder(view)
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie = movies[position]
            //Log.d("RecyclerView", "Binding movie: ${movie.name}, Year: ${movie.puplishedDate}, Rate: ${movie.rate}")

            holder.movieTitle.text = movie.name
            holder.movieDescription.text=movie.description
            holder.movieDetails.text=movie.details
            holder.movieDate.text=movie.puplishedDate
            holder.movieRate.text=(movie.rate).toString()
            holder.movieImage.setImageResource(movie.movieImage)
        }

        override fun getItemCount(): Int {
            return movies.size
        }
    }


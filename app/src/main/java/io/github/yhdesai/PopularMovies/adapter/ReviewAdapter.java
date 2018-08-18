package io.github.yhdesai.PopularMovies.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import io.github.yhdesai.PopularMovies.R;
import io.github.yhdesai.PopularMovies.model.Movie;
import io.github.yhdesai.PopularMovies.model.MovieReview;

import static io.github.yhdesai.PopularMovies.Constant.URL_IMAGE_PATH;


public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.MovieHolder> {



    private final Context mContext;
    private MovieReview[] mMovieReview = null;
    private final MovieClickListener mMovieClickListener;


    public ReviewAdapter(MovieReview[] movies, Context context, MovieClickListener movieClickListener) {
        mMovieReview = movies;
        mContext = context;
        mMovieClickListener = movieClickListener;
    }


    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_movie_poster, parent, false);

        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieHolder holder, int position) {

      /*  Picasso.with(mContext)
                .load(URL_IMAGE_PATH.concat(mMovieReview[position].getmMoviePoster()))
                .fit()
                .into(holder.imageViewHolder);*/

    }

    @Override
    public int getItemCount() {
        return mMovieReview.length;
    }

    public interface MovieClickListener {
        void onClickMovie(int position);
    }

    class MovieHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        final ImageView imageViewHolder;


        MovieHolder(View itemView) {
            super(itemView);


            imageViewHolder = itemView.findViewById(R.id.iv_list_item_poster);
            imageViewHolder.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int clickPosition = getAdapterPosition();
            mMovieClickListener.onClickMovie(clickPosition);
        }
    }


}

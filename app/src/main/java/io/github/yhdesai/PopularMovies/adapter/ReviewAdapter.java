package io.github.yhdesai.PopularMovies.adapter;


import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import io.github.yhdesai.PopularMovies.R;
import io.github.yhdesai.PopularMovies.model.MovieReview;


public class ReviewAdapter extends ArrayAdapter<MovieReview> {
    public ReviewAdapter(Context context, int resource, List<MovieReview> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_review, parent, false);
        }




        TextView authorTextView = convertView.findViewById(R.id.author);
        TextView contentTextView = convertView.findViewById(R.id.content);
       // TextView idTextView = convertView.findViewById(R.id.id);
       /* TextView urlTextView = convertView.findViewById(R.id.url);*/

        MovieReview review = getItem(position);

        authorTextView.setText(review.getrAuthor());
        contentTextView.setText(review.getrContent());
      //  idTextView.setText(review.getrId());
       /* urlTextView.setText(review.getrUrl());*/

        return convertView;
    }


}
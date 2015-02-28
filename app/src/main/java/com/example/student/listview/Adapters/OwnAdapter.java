package com.example.student.listview.Adapters;

/**
 * Created by Napil on 2/12/2015.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.R;

import java.util.ArrayList;
import java.util.List;


public class OwnAdapter extends BaseAdapter {

    Context context;
    ArrayList<Meme> memes;

    public OwnAdapter(Context context, List<Meme> memes) {
        this.context = context;
        this.memes = (ArrayList<Meme>) memes;
    }

    @Override
    public int getCount() {
        return memes.size();
    }

    @Override
    public Object getItem(int position) {
        return memes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View v;

        if(convertView == null)
        {
            LayoutInflater inflate = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = inflate.inflate(R.layout.list, parent, false);
        } else {

            v= convertView;
        }


        TextView uName = (TextView) v.findViewById(R.id.memename);
        TextView post = (TextView) v.findViewById(R.id.memedesc);
        ImageView imgView = (ImageView) v.findViewById(R.id.pp);
        uName.setText(memes.get(position).getName());
        post.setText(memes.get(position).getDescription());
        imgView.setImageResource(memes.get(position).getImage_ref());

        return v;
    }


}

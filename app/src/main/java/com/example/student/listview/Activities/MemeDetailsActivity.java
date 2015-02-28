package com.example.student.listview.Activities;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.R;

/**
 * Created by student on 2/14/15.
 */
public class MemeDetailsActivity extends ActionBarActivity{

    Meme memeObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memedetails1);

        memeObj = (Meme) this.getIntent().getExtras().getSerializable(Meme.KEY);//calls intent//

        TextView nameTextView = (TextView) findViewById(R.id.textView);
        nameTextView.setText(memeObj.getName());

        TextView nameTextView1 = (TextView) findViewById(R.id.textView2);
        nameTextView1.setText(memeObj.getDescription());

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(memeObj.getImage_ref());

    }

}

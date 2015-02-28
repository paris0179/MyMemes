package com.example.student.listview.Activities;

/**
 * Created by Angela on 2/12/2015.
 */

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.Adapters.OwnAdapter;
import com.example.student.listview.R;
import com.example.student.listview.Utils.MemeGenerator;


public class ActivityMain extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OwnAdapter ow = new OwnAdapter(this, MemeGenerator.generateMemes());
        setListAdapter(ow);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Meme memeObj = (Meme) getListAdapter().getItem(position);
        navigateToDetailsActivity(memeObj);
    }

    public void navigateToDetailsActivity(Meme memeObj)
    {
        Intent intent = new Intent(this, MemeDetailsActivity.class); //calls memedetailsactivity.java//
        intent.putExtra(Meme.KEY, memeObj);
        startActivity(intent); //opens profile//

    }


}

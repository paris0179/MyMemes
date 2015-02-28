package com.example.student.listview.Utils;

import com.example.student.listview.Models.Meme;
import com.example.student.listview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 2/14/15.
 */
public class MemeGenerator {
//initialize for name//
    static final String name[]={"Tim", "Matt", "Michael", "Melissa", "Diana", "Kevin", "Nelson", "Pamela", "Shanice", "Cody"};
//initialize for description//
    static final String desc[]={"Life is Good",
                                "Beauty is in eye of the Beholder",
                                "The best part of Life is Free",
                                "When Heart Speaks",
                                "Art is Infinite",
                                "A simple can change other people's lives",
                                "The true happiness is expression",
                                "Time is Gold",
                                "Your life in the Sand",
                                "Life is a never ending adventure "};
//initialize for image//
    static  final Integer[] img= new Integer[]{R.drawable.tim, R.drawable.matt,
                                               R.drawable.mihael, R.drawable.melissa,
                                               R.drawable.diana, R.drawable.kevin,
                                               R.drawable.nelson, R.drawable.pamela,
                                               R.drawable.shanice, R.drawable.cody};

    public static List<Meme> generateMemes(){

        ArrayList<Meme> memes = new ArrayList<Meme>();

            for(int x = 0; x < 10 ; x++)
            {
                Meme meme = new Meme();

                meme.setName(name[x]);
                meme.setDescription(desc[x]);
                meme.setImage_ref(img[x]);

                memes.add(meme);

            }


        return memes;
    }

}

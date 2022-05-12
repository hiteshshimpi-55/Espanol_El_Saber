/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.espanol_el_saber;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import android.widget.ListView;

public class NumbersActivity extends AppCompatActivity {
    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("One","Uno",R.raw.uno,R.drawable.number_one));
        words.add(new Word("Two","Dos",R.raw.dos,R.drawable.number_two));
        words.add(new Word("Three","Tres",R.raw.tres,R.drawable.number_three));
        words.add(new Word("Four","Cuatro",R.raw.quatro,R.drawable.number_four));
        words.add(new Word("Five","Cinco",R.raw.cinco,R.drawable.number_five));
        words.add(new Word("Six","Seis",R.raw.sieas,R.drawable.number_six));
        words.add(new Word("Seven","Siete",R.raw.siete,R.drawable.number_seven));
        words.add(new Word("Eight","Ocho",R.raw.ocho,R.drawable.number_eight));
        words.add(new Word("Nine","Nueve",R.raw.nueve,R.drawable.number_nine));
        words.add(new Word("Ten","Diez",R.raw.dias,R.drawable.number_ten));



        adapter = new WordAdapter(this, R.layout.image_item, words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        assert listView != null;
        listView.setAdapter(adapter);


    }

    @Override
    protected void onStop() {
        super.onStop();
        if(adapter != null) {
            adapter.releaseMediaPlayer();
        }
    }
}

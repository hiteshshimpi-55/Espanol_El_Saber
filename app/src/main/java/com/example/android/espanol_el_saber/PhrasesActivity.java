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
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {


    WordAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> phrases_words = new ArrayList<>();
        phrases_words.add(new Word("Good Morning","Buenos dias",R.raw.goodmorning));
        phrases_words.add(new Word("Good Afternoon","Buenos tardes",R.raw.goodafternoon));
        phrases_words.add(new Word("Nice to meet you","Mucho gusto",R.raw.muchogusto));
        phrases_words.add(new Word("How are you?","Como estas",R.raw.howareyou));
        phrases_words.add(new Word("Thank you","Gracias",R.raw.gracias));
        phrases_words.add(new Word("I am lost","Estoy perdido",R.raw.imlost));
        phrases_words.add(new Word("Excuse me","Disculpe",R.raw.disculpe));
        phrases_words.add(new Word("I miss you","Te extrano",R.raw.imissyou));
        phrases_words.add(new Word("I love you","Te quiero",R.raw.ily));
        phrases_words.add(new Word("Very good","Muy bien",R.raw.verygood));
        phrases_words.add(new Word("I'm learning Spanish","Estou aprendendo español",R.raw.learningspainish));
        phrases_words.add(new Word("I speak Spanish","Yo hablo español ",R.raw.ispeakspanish));
        phrases_words.add(new Word("I live in India","Yo vivo en India",R.raw.iliveinindia));
        phrases_words.add(new Word("I'm starving","Estoy hambriento",R.raw.iamstarving));
        phrases_words.add(new Word("Where are you?","Dónde estás",R.raw.whereareyou));
        phrases_words.add(new Word("I live in Spain","Yo Vivo en España",R.raw.iliveinspain));





        WordAdapter adapter = new WordAdapter(this,R.layout.image_item, phrases_words,R.color.category_phrases);

        ListView listView = (ListView) findViewById(R.id.list);

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

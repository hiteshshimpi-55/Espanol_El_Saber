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

public class FamilyActivity extends AppCompatActivity {
    WordAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> family_words = new ArrayList<>();
        family_words.add(new Word("Parents", "los padres", R.raw.parents, R.drawable.image_01));
        family_words.add(new Word("Father", "el padre", R.raw.thefather, R.drawable.family_father));
        family_words.add(new Word("Mother", "la madre", R.raw.mother, R.drawable.family_mother));
        family_words.add(new Word("Son", "el hijo", R.raw.elhijo, R.drawable.family_son));
        family_words.add(new Word("Daughter", "la hija", R.raw.daughter, R.drawable.family_daughter));
        family_words.add(new Word("Child", "Un niño", R.raw.child, R.drawable.family_older_brother));
        family_words.add(new Word("Husband", "el esposo", R.raw.thehusband, R.drawable.family_father));
        family_words.add(new Word("Wife", "la esposa", R.raw.wife, R.drawable.family_mother));
        family_words.add(new Word("Brother", "el hermano", R.raw.thebrother, R.drawable.family_younger_brother));
        family_words.add(new Word("Sister", "la hermana", R.raw.sister, R.drawable.family_younger_sister));

        WordAdapter adapter = new WordAdapter(this, R.layout.image_item, family_words, R.color.category_family);

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

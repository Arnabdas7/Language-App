package com.example.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("father", "baba", R.drawable.family_father));
        words.add(new word("mother", "maa", R.drawable.family_mother));
        words.add(new word("son", "chele", R.drawable.family_son));
        words.add(new word("daughter", "meye", R.drawable.family_daughter));
        words.add(new word("older brother", "boro dada", R.drawable.family_older_brother));
        words.add(new word("younger brother", "choto dada", R.drawable.family_younger_brother));
        words.add(new word("older sister", "boro didi", R.drawable.family_older_sister));
        words.add(new word("younger sister", "choto didi", R.drawable.family_younger_sister));
        words.add(new word("grandmother", "dida", R.drawable.family_grandmother));
        words.add(new word("grandfather", "dadu", R.drawable.family_grandfather));
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.

        listView.setAdapter(adapter);
    }
}
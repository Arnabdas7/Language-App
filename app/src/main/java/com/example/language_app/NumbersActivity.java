package com.example.language_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<word> words = new ArrayList<word>();
        words.add(new word("one", "ek", R.drawable.number_one));
        words.add(new word("two", "dui", R.drawable.number_two));
        words.add(new word("three", "teen", R.drawable.number_three));
        words.add(new word("four", "chaar", R.drawable.number_four));
        words.add(new word("five", "pacch", R.drawable.number_five));
        words.add(new word("six", "choi", R.drawable.number_six));
        words.add(new word("seven", "saath", R.drawable.number_seven));
        words.add(new word("eight", "aath", R.drawable.number_eight));
        words.add(new word("nine", "noi", R.drawable.number_nine));
        words.add(new word("ten", "das", R.drawable.number_ten));
        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);

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

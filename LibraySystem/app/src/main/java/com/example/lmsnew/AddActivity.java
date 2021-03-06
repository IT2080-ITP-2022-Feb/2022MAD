package com.example.lmsnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

        EditText title_input, author_input, pages_input;
        Button add_button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        pages_input = findViewById(R.id.pages_input);
        add_button2 = findViewById(R.id.add_button2);
        add_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bookDatabase myDB = new bookDatabase(AddActivity.this);
                myDB.addBook(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim(),
                       Integer.valueOf(pages_input.getText().toString().trim()) );
                        startActivity(getIntent());
                        finish();


            }
        });
    }
}
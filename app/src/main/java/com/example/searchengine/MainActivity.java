package com.example.searchengine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText text_search;
    Spinner spinner_search;
    Button btn_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_search = findViewById(R.id.text_search);
        spinner_search = findViewById(R.id.spinner_search);
        btn_search = findViewById(R.id.btn_search);

        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.search_array, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        if (spinner_search != null) {
            spinner_search.setAdapter(adapter);
        }

        spinner_search.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (adapterView.getItemAtPosition(i).equals("Choose your Browser"))
                {
                    //do nothing
                }

                else
                {
                    //on selecting a spinner item
                    String item = adapterView.getItemAtPosition(i).toString();

                    //show selected spinner item
                    Toast.makeText(adapterView.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();

                    //anything else you want to do on item selecion do here
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // TODO Auto-generaated method stub
            }
        });

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchTerms = text_search.getText().toString();
                String item = spinner_search.getSelectedItem().toString();
                if (item.equals("Choose your Browser"))
                {
                    //do nothing
                }
                else if (item.equals("Google"))
                {
                    Uri uri = Uri.parse("https://www.google.com/search?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Bing"))
                {
                    Uri uri = Uri.parse("https://www.bing.com/search?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Yahoo! Search"))
                {
                    Uri uri = Uri.parse("https://search.yahoo.com/search?p=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Baidu"))
                {
                    Uri uri = Uri.parse("https://www.baidu.com/s?wd=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("DuckDuckGo"))
                {
                    Uri uri = Uri.parse("https://duckduckgo.com/?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Naver"))
                {
                    Uri uri = Uri.parse("https://m.search.naver.com/search.naver?sm=mtp_hty.hst&where=m&query=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Ask.com"))
                {
                    Uri uri = Uri.parse("https://www.ask.com/web?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Aol Search"))
                {
                    Uri uri = Uri.parse("https://search.aol.com/aol/search?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("WolframAlpha"))
                {
                    Uri uri = Uri.parse("https://www.wolframalpha.com/input/?i=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Yandex"))
                {
                    Uri uri = Uri.parse("https://yandex.com/search/?text=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("WebCrawler"))
                {
                    Uri uri = Uri.parse("https://www.webcrawler.com/serp?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Search"))
                {
                    Uri uri = Uri.parse("https://www.search.com/web?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Dogpile"))
                {
                    Uri uri = Uri.parse("https://www.dogpile.com/serp?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Excite"))
                {
                    Uri uri = Uri.parse("https://results.excite.com/serp?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Info.com"))
                {
                    Uri uri = Uri.parse("https://www.info.com/serp?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Swisscows"))
                {
                    Uri uri = Uri.parse("https://swisscows.com/web?query=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("KidzSearch"))
                {
                    Uri uri = Uri.parse("https://search.kidzsearch.com/kzsearch.php?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Ecosia"))
                {
                    Uri uri = Uri.parse("https://www.ecosia.org/search?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
                else if (item.equals("Mojeek"))
                {
                    Uri uri = Uri.parse("https://www.mojeek.com/search?q=" + searchTerms);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }
            }
        });
    }
}
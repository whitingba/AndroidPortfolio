package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {

    NumberPicker options;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //findView by id to retrieve the reference to the NumberPicker named options
        options = (NumberPicker) findViewById(R.id.numberPick);

        //retrieve reference to the WebView
        webView = (WebView) findViewById(R.id.webView);

        //define an array of strings that will show in the NumberPicker
        String[] stringOptions = {
                "Portfolio Website",
                "Ladies Of Tea",
                "Denver Lease Connection",
                "CRUD Masters",
                "Weather or not to drink"
        };

        //associate the array of strings to the NumberPicker
        options.setDisplayedValues(stringOptions);

        //specify the number of NumberPicker options
        options.setMinValue(0);
        options.setMaxValue(stringOptions.length - 1);



    }
    //point to where the option will navigate to once the button is pushed
    public void navigate(View v) {
        //retrieve the user's choice from the NumberPicker
        int choice = options.getValue();
        //loan the page into the webView
        if(choice == 0) {
            //webView.setWebViewClient(new WebViewClient());
            webView.loadUrl("file:///android_asset/Portfolio.html");
        } else if (choice == 1) {
            webView.loadUrl("file:///android_asset/Tea.html");
        } else if (choice == 2) {
            webView.loadUrl("file:///android_asset/DenverLease.html");
        } else if (choice == 3) {
            webView.loadUrl("file:///android_asset/crud.html");
        } else if (choice == 4) {
            webView.loadUrl("file:///android_asset/drinks.html");
        }
    }

}

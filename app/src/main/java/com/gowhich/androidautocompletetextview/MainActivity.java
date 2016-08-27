package com.gowhich.androidautocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoTextview;
    private MultiAutoCompleteTextView multiAutoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoTextview = (AutoCompleteTextView) this.findViewById(R.id.autotext);
        multiAutoTextView = (MultiAutoCompleteTextView) this.findViewById(R.id.mulAutotext);


        String[] autoStr = new String[]{"her","hers","him","she","you","we","ours","everyone","something"};

        //第二个参数是适配器的分割 - 下拉风格
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, autoStr);

        autoTextview.setAdapter(adapter);


        multiAutoTextView.setAdapter(adapter);
        //逗号分割
        multiAutoTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}

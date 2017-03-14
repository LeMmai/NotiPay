package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.myapplication.agency.Agency;
import com.example.android.myapplication.agency.AgencyAdapter;

import java.util.ArrayList;

/**
 * Created by User on 3/14/2017.
 */

public class LinkAccountActivity extends AppCompatActivity {

    // Search EditText
    EditText inputSearch;
    AgencyAdapter agencyAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.link_account);

        final ArrayList<Bill> bills = new ArrayList<>();

        final ArrayList<Agency> agencies = new ArrayList<>();

        /*agencies.add(new Agency("PLDT","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("BCWD","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("ANECO","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("FIL PRODUCTS","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("ZENERGY","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("SMART","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("GLOBE","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("SUN","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("TNT","01234567890","Agusan del Norte","Butuan City"));
        agencies.add(new Agency("METROBANK","01234567890","Agusan del Norte","Butuan City"));
        */

        agencies.add(new Agency("PLDT"));
        agencies.add(new Agency("BCWD"));
        agencies.add(new Agency("ANECO"));
        agencies.add(new Agency("FIL PRODUCTS"));
        agencies.add(new Agency("ZENERGY"));
        agencies.add(new Agency("SMART"));
        agencies.add(new Agency("GLOBE"));
        agencies.add(new Agency("SUN"));
        agencies.add(new Agency("TNT"));
        agencies.add(new Agency("METROBANK"));

        agencyAdapter = new AgencyAdapter(this, agencies);
        ListView agencyListView = (ListView) findViewById(R.id.listOfAgencies);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        agencyListView.setAdapter(agencyAdapter);
        agencyListView.setOnItemClickListener( new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(LinkAccountActivity.this, "amazing", Toast.LENGTH_SHORT).show();
            }
        });

        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                LinkAccountActivity.this.agencyAdapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }
}



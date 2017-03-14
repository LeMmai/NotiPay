package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 3/14/2017.
 */

public class LinkAccountActivity extends AppCompatActivity {

    // Search EditText
    EditText inputSearch;
    BillAdapter billAdapter;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.link_account);

        final ArrayList<Bill> bills = new ArrayList<>();

        bills.add(new Bill("PLDT","0004",1000.04,"03/04/2017","Mel Albert A. Agra"));
        bills.add(new Bill("BCWD","0005",2000.04,"03/04/2017","Chloe Grace Moretz"));
        bills.add(new Bill("ANECO","0006",3000.04,"03/04/2017", "Loida Mae A. Ungab"));
        bills.add(new Bill("ZENERGY","0007",4000.04,"03/04/2017","Juan A. Navarro"));
        bills.add(new Bill("FIL PRODUCTS","0008",5000.04,"03/04/2017","Kamille "));
        bills.add(new Bill("GLOBE","0009",6000.04,"03/04/2017","Deborah Herrera"));
        bills.add(new Bill("SMART","0010",7400.04,"03/04/2017","Nica Oclarit Absin"));
        bills.add(new Bill("SUN","0011",8023.04,"03/04/2017","Emma Watson"));
        bills.add(new Bill("TNT","0012",9450.04,"03/04/2017","Ana Mae Go. Dagoc"));
        bills.add(new Bill("METROBANK","0013",7000.04,"03/04/2017","Rovelyn Gallego"));


        billAdapter = new BillAdapter(this, bills);
        ListView billListView = (ListView) findViewById(R.id.listOfAgencies);
        inputSearch = (EditText) findViewById(R.id.inputSearch);
        billListView.setAdapter(billAdapter);


        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                LinkAccountActivity.this.billAdapter.getFilter().filter(cs);
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



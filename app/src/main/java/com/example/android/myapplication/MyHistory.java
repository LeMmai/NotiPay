package com.example.android.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by User on 3/12/2017.
 */

public class MyHistory extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.activity_my_bills, container, false);

        final ArrayList<Bill> bills = new ArrayList<>();



        bills.add(new Bill("PLDT","0004",1000.04,"03/04/2017","Melai Albertai A. Agra"));
        bills.add(new Bill("BCWD","0005",2000.04,"03/04/2017","Chloeai Grace Moretz"));
        bills.add(new Bill("ANECO","0006",3000.04,"03/04/2017", "Loida Mae A. Ungab"));
        bills.add(new Bill("ZENERGY","0007",4000.04,"03/04/2017","Juan A. Navarro"));
        bills.add(new Bill("FIL PRODUCTS","0008",5000.04,"03/04/2017","Kamille "));
        bills.add(new Bill("GLOBE","0009",6000.04,"03/04/2017","Deborah Herrera"));
        bills.add(new Bill("SMART","0010",7400.04,"03/04/2017","Nica Oclarit Absin"));
        bills.add(new Bill("SUN","0011",8023.04,"03/04/2017","Emma Watson"));
        bills.add(new Bill("TNT","0012",9450.04,"03/04/2017","Ana Mae Go. Dagoc"));
        bills.add(new Bill("METROBANK","0013",7000.04,"03/04/2017","Rovelyn Gallego"));


        BillAdapter billAdapter = new BillAdapter(getContext(), bills);
        ListView billListView = (ListView) view.findViewById(R.id.listOfBills2);
        billListView.setAdapter(billAdapter);

        return view;
    }
}

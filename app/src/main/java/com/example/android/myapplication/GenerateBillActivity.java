package com.example.android.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ListView;

import com.example.android.myapplication.data.DbHelper;

import java.util.ArrayList;



public class GenerateBillActivity extends AppCompatActivity {

    private DbHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bill_list);



        //original

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


        BillAdapter billAdapter = new BillAdapter(this, bills);
        ListView billListView = (ListView) findViewById(R.id.listOfBills);
        billListView.setAdapter(billAdapter);

        //end of original


        /*
         ///// JSON
        try
        {
            final ArrayList<Bill> bills = new ArrayList<>();

            //Variables
            String agencyName;
            String accountNumber;
            double amoundDue;
            String dueDate;
            String customerName;

            JSONArray dataArray;
            JSONObject object;
            //End of Variables

            String data = "\n" +
                    "\n" +
                    "[\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"PLDT\",\n" +
                    "\t\"name\" : \"Mel Albert A. Agra\",\n" +
                    "\t\"account_number\" : \"0004\",\n" +
                    "\t\"amount_due\" : 4015.06,\n" +
                    "\t\"due_date\" : \"03/04/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"BCWD\",\n" +
                    "\t\"name\" : \"Chloe Grace Moretz\",\n" +
                    "\t\"account_number\" : \"0005\",\n" +
                    "\t\"amount_due\" : 7320.22,\n" +
                    "\t\"due_date\" : \"03/05/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"ANECO\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0005\",\n" +
                    "\t\"amount_due\" : 2200.14,\n" +
                    "\t\"due_date\" : \"03/06/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"ZENERGY\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0006\",\n" +
                    "\t\"amount_due\" : 1400.01,\n" +
                    "\t\"due_date\" : \"03/07/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"FIL PRODUCTS\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0007\",\n" +
                    "\t\"amount_due\" : 1300.04,\n" +
                    "\t\"due_date\" : \"03/08/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"GLOBE\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0008\",\n" +
                    "\t\"amount_due\" : 4900.04,\n" +
                    "\t\"due_date\" : \"03/09/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"SMART\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0009\",\n" +
                    "\t\"amount_due\" : 3300.01,\n" +
                    "\t\"due_date\" : \"03/10/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"SUN\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0010\",\n" +
                    "\t\"amount_due\" : 7800.23,\n" +
                    "\t\"due_date\" : \"03/11/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"TNT\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0011\",\n" +
                    "\t\"amount_due\" : 4520.00,\n" +
                    "\t\"due_date\" : \"03/11/2017\"\n" +
                    "\t},\n" +
                    "\t{\n" +
                    "\t\"agency_name\" : \"METROBANK\",\n" +
                    "\t\"name\" : \"Emma Watson\",\n" +
                    "\t\"account_number\" : \"0012\",\n" +
                    "\t\"amount_due\" : 3400.11,\n" +
                    "\t\"due_date\" : \"03/12/2017\"\n" +
                    "\t}\t\t \t\t\n" +
                    "]";

            dataArray = new JSONArray(data);

            for (int i = 0; i < dataArray.length(); i++)
            {
                object = dataArray.getJSONObject(i);

                agencyName = object.getString("agency_name");
                accountNumber = object.getString("account_number");
                amoundDue = object.getDouble("amount_due");
                dueDate = object.getString("due_date");
                customerName = object.getString("name");

                bills.add(new Bill(agencyName, accountNumber, amoundDue, dueDate, customerName));
            }

            BillAdapter billAdapter = new BillAdapter(this, bills);
            ListView billListView = (ListView) findViewById(R.id.listOfBills);
            billListView.setAdapter(billAdapter);

        }
        catch (JSONException e)
        {
            e.printStackTrace();
        }

        /////END OF JASON
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu options from the res/menu/menu_catalog.xml file.
        // This adds menu items to the app bar.
        getMenuInflater().inflate(R.menu.menu_top_right, menu);
        return true;
    }


}

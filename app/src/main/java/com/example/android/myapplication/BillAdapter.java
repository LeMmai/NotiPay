package com.example.android.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by User on 2/25/2017.
 */

public class BillAdapter extends ArrayAdapter<Bill> {


    public BillAdapter(Context context, ArrayList<Bill> bills)
    {
        super(context, 0, bills);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {



        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.bill_item, parent, false);
        }




        Bill currentBill = getItem(position);


        TextView agencyNameTextView = (TextView) listItemView.findViewById(R.id.agencyName);
        agencyNameTextView.setText(currentBill.getAgencyName());

        //TextView accountNumberTextView = (TextView) listItemView.findViewById(R.id.accountNumber);
        //accountNumberTextView.setText(currentBill.getCustomerAccountNo());

        TextView amountDueTextView = (TextView) listItemView.findViewById(R.id.amountDue);
        amountDueTextView.setText("P " + currentBill.getAmountDue() + "");

        TextView dueDateTextView = (TextView) listItemView.findViewById(R.id.dueDate);
        //dueDateTextView.setText(currentBill.getDueDate());

        String startDateString = currentBill.getDueDate();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        DateFormat df1 = new SimpleDateFormat("MMM dd, yyyy");
        Date startDate;
        try {
            startDate = df.parse(startDateString);
            String newDateString = df1.format(startDate);
            dueDateTextView.setText(newDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        TextView accountNumberTextView = (TextView) listItemView.findViewById(R.id.customerName);
        accountNumberTextView.setText(currentBill.getCustomerName());

        ImageView moreButton = (ImageButton) listItemView.findViewById(R.id.moreButton);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Show Options? ", Toast.LENGTH_SHORT).show();

                PopupMenu popup;
                popup = new PopupMenu(getContext(), v);
                MenuInflater inflater = popup.getMenuInflater();
                inflater.inflate(R.menu.menu_bill_item, popup.getMenu());
                popup.show();

            }
        });



        return listItemView;
    }


}

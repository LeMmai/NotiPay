package com.example.android.myapplication.agency;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.myapplication.R;

import java.util.ArrayList;

/**
 * Created by User on 3/14/2017.
 */

public class AgencyAdapter extends ArrayAdapter<Agency> {

    public AgencyAdapter(Context context, ArrayList<Agency> agencies)
    {
        super(context, 0, agencies);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View listItemView = convertView;

        if(listItemView == null) {

            listItemView = LayoutInflater.from(getContext()).inflate(

                    R.layout.agency_item, parent, false);
        }

        Agency currentAgency = getItem(position);

        TextView agencyTextView = (TextView) listItemView.findViewById(R.id.agencyName1);
        agencyTextView.setText(currentAgency.getAgencyName());

       /* TextView tinTextView = (TextView) listItemView.findViewById(R.id.agency_tin);
        tinTextView.setText(currentAgency.getTin());

        TextView provinceTextView = (TextView) listItemView.findViewById(R.id.agency_province);
        provinceTextView.setText(currentAgency.getProvince());

        TextView cityTextView = (TextView) listItemView.findViewById(R.id.agency_city);
        cityTextView.setText(currentAgency.getCity());

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
        */

        return listItemView;
    }
}

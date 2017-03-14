package com.example.android.myapplication;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;

/**
 * Created by User on 3/13/2017.
 */

public class MyPreferencesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MyPreferenceFragment()).commit();
    }

    public static class MyPreferenceFragment extends PreferenceFragment
    {
        @Override
        public void onCreate(final Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}

/*
SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
String strUserName = SP.getString("username", "NA");
boolean bAppUpdates = SP.getBoolean("applicationUpdates",false);
String downloadType = SP.getString("downloadType","1");
*/


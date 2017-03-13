package com.example.android.myapplication.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.myapplication.data.DataContract.DataEntry;

/**
 * Created by User on 3/3/2017.
 */

public class DbHelper extends SQLiteOpenHelper{

    private static final String DATABASE_NAME = "billsDb.db";

    private static final int DATABASE_VERSION = 1;

    public DbHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_USER_TABLE = "CREATE TABLE " + DataEntry.TN_F_USER + "("
                + DataEntry.C_ID_F_TBL_USER + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_FIRSTNAME_F_TBL_USER + " TEXT NOT NULL, "
                + DataEntry.C_LASTNAME_F_TBL_USER + " TEXT NOT NULL, "
                + DataEntry.C_EMAIL_F_TBL_USER + " TEXT NOT NULL, "
                + DataEntry.C_PASSWORDHASH_F_TBL_USER + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_USER_TABLE);

        String SQL_CREATE_USERLINKEDACCOUNTS_TABLE = "CREATE TABLE " + DataEntry.TN_F_USER_LINKED_ACCOUNTS + "("
                + DataEntry.C_USER_ID_F_TBL_USERLINKEDACCOUNTS + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_AGENCY_ID_F_TBL_USERLINKEDACCOUNTS + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_CUSTOMERACCOUNTNO_ID_F_TBL_USERLINKEDACCOUNTS + " TEXT PRIMARY KEY NOT NULL);";

        db.execSQL(SQL_CREATE_USERLINKEDACCOUNTS_TABLE);

        String SQL_CREATE_AGENCY_TABLE = "CREATE TABLE " + DataEntry.TN_F_AGENCY + "("
                + DataEntry.C_AGENCY_ID_F_TBL_AGENCY + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_AGENCY_NAME_F_TBL_AGENCY + " TEXT NOT NULL, "
                + DataEntry.C_TIN_F_TBL_AGENCY + " TEXT NOT NULL, "
                + DataEntry.C_ADDRESS_F_TBL_AGENCY + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_AGENCY_TABLE);

        String SQL_CREATE_CUSTOMER_TABLE = "CREATE TABLE " + DataEntry.TN_F_CUSTOMER + "("
                + DataEntry.C_AGENCY_ID_F_TBL_CUSTOMER + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_CUSTOMERACCOUNTNO_F_TBL_CUSTOMER + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_FIRSTNAME_F_TBL_CUSTOMER + " TEXT NOT NULL, "
                + DataEntry.C_LASTNAME_F_TBL_CUSTOMER + " TEXT NOT NULL, "
                + DataEntry.C_ADDRESS_F_TBL_CUSTOMER + "  TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_CUSTOMER_TABLE);

        String SQL_CREATE_AGENCY_CONTACT_INFO_TABLE = "CREATE TABLE " + DataEntry.TN_F_AGENCY_CONTACT_INFO + "("
                + DataEntry.C_AGENCY_ID_F_TBL_AGENCY_CONTACT_INFO + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_AGENCY_CONTACT_TYPE_F_TBL_AGENCY_CONTACT_INFO+ " TEXT NOT NULL, "
                + DataEntry.C_AGENCY_CONTACT_DETAIL_F_TBL_AGENCY_CONTACT_INFO + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_AGENCY_CONTACT_INFO_TABLE);

        String SQL_CREATE_BILL_TABLE = "CREATE TABLE " + DataEntry.TN_F_BILL + "("
                + DataEntry.C_BILL_NUMBER_F_TBL_BILL + " TEXT NOT NULL, "
                + DataEntry.C_CUSTOMER_ACCOUNT_NO_F_TBL_BILL + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_AGENCY_ID_F_TBL_BILL + " TEXT PRIMARY KEY NOT NULL, "
                + DataEntry.C_BILLING_DATE_F_TBL_BILL + " TEXT NOT NULL, "
                + DataEntry.C_BILLING_MONTH_F_TBL_BILL + " TEXT NOT NULL, "
                + DataEntry.C_DUE_DATE_F_TBL_BILL + " TEXT NOT NULL, "
                + DataEntry.C_AMOUNT_F_TBL_BILL + " TEXT NOT NULL, "
                + DataEntry.C_ADDRESS_F_TBL_CUSTOMER + " TEXT NOT NULL, "
                + DataEntry.C_PAID_F_TBL_BILL + " INTEGER NOT NULL, "
                + DataEntry.C_DATEPAID_F_TBL_BILL + " TEXT NOT NULL);";

        db.execSQL(SQL_CREATE_BILL_TABLE);
        /////////

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

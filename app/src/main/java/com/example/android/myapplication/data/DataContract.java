package com.example.android.myapplication.data;

import android.provider.BaseColumns;

/**
 * Created by User on 3/3/2017.
 */

public final class DataContract {

    private DataContract(){}

    public static final class DataEntry implements BaseColumns
    {

        //TN = TABLE NAME
        //C = COLUMN
        //F = FOR
        public final static String TN_F_USER = "tbl_User";
        public final static String C_ID_F_TBL_USER = "UserID";
        public final static String C_FIRSTNAME_F_TBL_USER = "Firstname";
        public final static String C_LASTNAME_F_TBL_USER = "Lastname";
        public final static String C_EMAIL_F_TBL_USER = "Email";
        public final static String C_PASSWORDHASH_F_TBL_USER = "PasswordHash";

        public final static String TN_F_USER_LINKED_ACCOUNTS = "tbl_UserLinkedAccounts";
        public final static String C_USER_ID_F_TBL_USERLINKEDACCOUNTS = "UserID";
        public final static String C_AGENCY_ID_F_TBL_USERLINKEDACCOUNTS = "AgencyID";
        public final static String C_CUSTOMERACCOUNTNO_ID_F_TBL_USERLINKEDACCOUNTS = "CustomerAccountNo";

        public final static String TN_F_AGENCY = "tbl_Agency";
        public final static String C_AGENCY_ID_F_TBL_AGENCY = "AgencyID";
        public final static String C_AGENCY_NAME_F_TBL_AGENCY = "AgencyName";
        public final static String C_TIN_F_TBL_AGENCY = "TIN";
        public final static String C_ADDRESS_F_TBL_AGENCY = "Address";

        public final static String TN_F_CUSTOMER = "tbl_Customer";
        public final static String C_CUSTOMERACCOUNTNO_F_TBL_CUSTOMER = "CustomerAccountNo";
        public final static String C_FIRSTNAME_F_TBL_CUSTOMER = "Firstname";
        public final static String C_LASTNAME_F_TBL_CUSTOMER = "Lastname";
        public final static String C_ADDRESS_F_TBL_CUSTOMER = "Address";
        public final static String C_AGENCY_ID_F_TBL_CUSTOMER = "AgencyID";

        public final static String TN_F_AGENCY_CONTACT_INFO = "tbl_AgencyContactInfo";
        public final static String C_AGENCY_ID_F_TBL_AGENCY_CONTACT_INFO = "AgencyID";
        public final static String C_AGENCY_CONTACT_TYPE_F_TBL_AGENCY_CONTACT_INFO = "AgencyContactType";
        public final static String C_AGENCY_CONTACT_DETAIL_F_TBL_AGENCY_CONTACT_INFO = "AgencyContactDetail";

        public final static String TN_F_BILL = "tbl_Bill";
        public final static String C_BILL_NUMBER_F_TBL_BILL = "BillNumber";
        public final static String C_BILLING_DATE_F_TBL_BILL = "BillingDate";
        public final static String C_BILLING_MONTH_F_TBL_BILL = "BillingMonth";
        public final static String C_DUE_DATE_F_TBL_BILL = "DueDate";
        public final static String C_AMOUNT_F_TBL_BILL = "Amount";
        public final static String C_CUSTOMER_ACCOUNT_NO_F_TBL_BILL = "CustomerAccountNo";
        public final static String C_AGENCY_ID_F_TBL_BILL = "AgencyID";
        public final static String C_PAID_F_TBL_BILL = "Paid";
        public final static String C_DATEPAID_F_TBL_BILL = "DatePaid";

        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


    }
}

package com.example.android.myapplication.agency;

/**
 * Created by User on 3/14/2017.
 */

public class Agency {

    private String agencyName;
    private String tin;
    private String province;
    private String city;

    public Agency(String agencyName, String tin, String province, String city) {
        this.agencyName = agencyName;
        this.tin = tin;
        this.province = province;
        this.city = city;
    }

    public Agency(String agencyName) {
        this.agencyName = agencyName;
    }


    public void setAgencyName(String agencyName) {

        this.agencyName = agencyName;
    }

    //setters
    public void setTin(String tin) {
        this.tin = tin;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }



    //getters
    public String getAgencyName() {
        return agencyName;
    }

    public String getTin() {
        return tin;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }


}

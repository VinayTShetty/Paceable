package com.parceable.CustomObjects;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable {
    String userid="";
    String userName="";
    String password="";

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Default Constructor
     */
  public UserData(String  userid,String userName,String password){
        this.userid=userid;
        this.userName=userName;
        this.password=password;
    }
    /**
     *
     * Parceable Constructor.
     */
    protected UserData(Parcel in) {
        userid = in.readString();
        userName = in.readString();
        password = in.readString();
    }
    /**
     *
     * Override methods
     */
    @Override
    public int describeContents() {
        return 0;
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(userid);
        dest.writeString(userName);
        dest.writeString(password);
    }
    /**
     * Create a static final variable CREATOR
     */
    public static final Creator<UserData> CREATOR = new Creator<UserData>() {
        @Override
        public UserData createFromParcel(Parcel in) {
            return new UserData(in);
        }

        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }
    };
}

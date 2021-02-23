package com.parceable.CustomObjects;

import android.os.Parcel;
import android.os.Parcelable;

public class UserData implements Parcelable {
    String userid="";
    String userName="";
    String password="";


    protected UserData(Parcel in) {
        userid = in.readString();
        userName = in.readString();
        password = in.readString();
    }

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
}

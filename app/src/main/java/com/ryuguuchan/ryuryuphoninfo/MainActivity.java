package com.ryuguuchan.ryuryuphoninfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.text.format.Formatter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class MainActivity extends AppCompatActivity {

    private String getIP() {
        WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        return Formatter.formatIpAddress(wifi.getConnectionInfo().getIpAddress());
    }

    private String getMAC() {
        WifiManager wifi = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        return wifi.getConnectionInfo().getMacAddress();
    }



    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting the device's name
        ((TextView)findViewById(R.id.textView5)).setText(((TextView)findViewById(R.id.textView5)).getText() + ": \t" + Build.MODEL);

        // getting the device's IP address
        ((TextView)findViewById(R.id.textView6)).setText(((TextView)findViewById(R.id.textView6)).getText() + ": \t" + getIP());

        // getting the device's MAC address
        ((TextView)findViewById(R.id.textView7)).setText(((TextView)findViewById(R.id.textView7)).getText() + ": \t" + getMAC());

        // getting the device's Manufacturer
        ((TextView)findViewById(R.id.textView8)).setText(((TextView)findViewById(R.id.textView8)).getText() + ": \t" + Build.MANUFACTURER);

        // getting the device's Brand
        ((TextView)findViewById(R.id.textView9)).setText(((TextView)findViewById(R.id.textView9)).getText() + ": \t" + Build.BRAND);

        // getting the devie's hardware info
        ((TextView)findViewById(R.id.textView10)).setText(((TextView)findViewById(R.id.textView10)).getText() + ": \t" + Build.HARDWARE);
    }
}
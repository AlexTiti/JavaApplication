package com.example.administrator.javaapplication.adapter_design_pattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.javaapplication.R;
import com.example.administrator.javaapplication.factory_design.ConnectFactory;
import com.example.administrator.javaapplication.factory_design.MobileF;

/**
 * @author Administrator
 */
public class AdapterActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        Mobile mobile = new Mobile("乐视");
        Usb usb = new Usb();
        TypeC typeC = new TypeAdapter(usb);
        mobile.getConnectLineType(typeC);

        Mobile iphone = new Mobile("Apple");
        Iphone iphone1 = new TypeAdapter(usb);
        iphone.getConnectLineType(iphone1);

        MobileF mobileF = new MobileF("Android");
        mobileF.getType(ConnectFactory.create("Android"));
        MobileF mobileF1 = new MobileF("TypeC");
        mobileF1.getType(ConnectFactory.create("TypeC"));


    }
}

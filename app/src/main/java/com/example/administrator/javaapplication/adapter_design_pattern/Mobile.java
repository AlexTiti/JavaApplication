package com.example.administrator.javaapplication.adapter_design_pattern;

import android.util.Log;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/29
 *   @desc     :
 *   @version  :   V 1.0.9
 */

class Mobile {

    private final String mobileName;

    public Mobile(String mobileName) {
        this.mobileName = mobileName;
    }

    public void getConnectLineType( TypeC  typeC){
        Log.e("=====",mobileName+"==拿到了："+typeC.retrunConnectTypeC());
    }
    public void getConnectLineType( Iphone  iphone){
        Log.e("=====",mobileName+"==拿到了："+iphone.retrunConnectIphone());
    }
}

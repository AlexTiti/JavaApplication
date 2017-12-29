package com.example.administrator.javaapplication.factory_design;

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

public class MobileF {
    String modle;

    public MobileF(String modle) {
        this.modle = modle;
    }

     public void  getType(Connect connect){
         Log.e(modle+"====",connect.getConnectType());
     }
}

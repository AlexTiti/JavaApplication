package com.example.administrator.javaapplication.factory_design;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/29
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class Android implements Connect{
    @Override
    public String getConnectType() {

        return "Usb";
    }
}

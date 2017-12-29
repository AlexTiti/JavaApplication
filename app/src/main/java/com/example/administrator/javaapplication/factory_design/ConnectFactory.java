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

public class ConnectFactory {

    public static Connect create(String modle) {
        Connect connect = null;
        switch (modle) {
            case "Android":
                connect = new Android();
                break;
            case "TypeC":
                connect = new TypeC();
                break;
            case "Iphone":
                connect = new Iphone();
                break;
            default:

                break;
        }
        return connect;
    }

}

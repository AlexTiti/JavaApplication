package com.example.administrator.javaapplication.adapter_design_pattern;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/29
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class TypeAdapter implements TypeC,Iphone{

    private final Usb usb;

    public TypeAdapter(Usb usb) {
        this.usb = usb;
    }

    @Override
    public String retrunConnectTypeC() {
        String type = usb.returnUSB();
        return type.replace(type,"TypeC");
    }


    @Override
    public String retrunConnectIphone() {
        String type = usb.returnUSB();
        return type.replace(type,"Iphone");
    }
}

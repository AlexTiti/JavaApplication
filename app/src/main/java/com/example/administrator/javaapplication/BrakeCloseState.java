package com.example.administrator.javaapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/27
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class BrakeCloseState implements State {

    private Context context;
    private Cart mCart;

    public BrakeCloseState(Context context, Cart mCart) {
        this.context = context;
        this.mCart = mCart;
    }



    @Override
    public void brakeOpen() {
        Toast.makeText(context,"BrakeOpen",Toast.LENGTH_SHORT).show();
        mCart.setmState(mCart.getmBrakeOpenState());
    }

    @Override
    public void brakeClose() {
        Toast.makeText(context,"Brake Close Down",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void protectOpen() {
        Toast.makeText(context,"不可用",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void protectClose() {
        Toast.makeText(context,"不可用",Toast.LENGTH_SHORT).show();
    }
}

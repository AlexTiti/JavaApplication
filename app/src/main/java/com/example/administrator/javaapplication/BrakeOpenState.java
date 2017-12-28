package com.example.administrator.javaapplication;

import android.content.Context;
import android.util.Log;
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

public class BrakeOpenState implements State {
    private Context context;
    private Cart mCart;

    public BrakeOpenState(Context context, Cart mCart) {
        this.context = context;
        this.mCart = mCart;
    }



    @Override
    public void brakeOpen() {
        Toast.makeText(context,"Brake open Down",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void brakeClose() {
        Toast.makeText(context,"brakeClose",Toast.LENGTH_SHORT).show();
        mCart.setmState(mCart.getmBrakeCloseState());


    }

    @Override
    public void protectOpen() {
        Toast.makeText(context,"Protecting.....",Toast.LENGTH_SHORT).show();
        mCart.setmState(mCart.getmProtectState());
    }

    @Override
    public void protectClose() {
        Toast.makeText(context,"Protect Close",Toast.LENGTH_SHORT).show();
        mCart.setmState(mCart.getmProtectCloseState());
    }
}

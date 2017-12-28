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

public class ProtectState implements State {
    private Context context;
    private Cart mCart;

    public ProtectState(Context context, Cart cart) {
        this.context = context;
        this.mCart = cart;
    }

    @Override
    public void brakeOpen() {
        Toast.makeText(context,"Brake open Down",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void brakeClose() {
        Toast.makeText(context,"不可用",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void protectOpen() {
        Toast.makeText(context,"Protect open Down",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void protectClose() {
        Toast.makeText(context,"Protect Close",Toast.LENGTH_SHORT).show();
        mCart.setmState(mCart.getmProtectCloseState());
    }
}

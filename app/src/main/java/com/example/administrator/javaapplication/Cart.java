package com.example.administrator.javaapplication;

import android.content.Context;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/27
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class Cart {

    private BrakeOpenState mBrakeOpenState;
    private BrakeCloseState mBrakeCloseState;
    private ProtectCloseState mProtectCloseState;
    private ProtectState mProtectState;

    private State mState;

    public Cart(Context context) {
        this.mBrakeOpenState = new BrakeOpenState(context,this);
        this.mBrakeCloseState = new BrakeCloseState(context,this);
        this.mProtectCloseState = new ProtectCloseState(context,this);
        this.mProtectState = new ProtectState(context,this);
        mState = mBrakeOpenState;
    }

    public BrakeOpenState getmBrakeOpenState() {
        return mBrakeOpenState;
    }

    public void setmBrakeOpenState(BrakeOpenState mBrakeOpenState) {
        this.mBrakeOpenState = mBrakeOpenState;
    }

    public BrakeCloseState getmBrakeCloseState() {
        return mBrakeCloseState;
    }

    public void setmBrakeCloseState(BrakeCloseState mBrakeCloseState) {
        this.mBrakeCloseState = mBrakeCloseState;
    }

    public ProtectCloseState getmProtectCloseState() {
        return mProtectCloseState;
    }

    public void setmProtectCloseState(ProtectCloseState mProtectCloseState) {
        this.mProtectCloseState = mProtectCloseState;
    }

    public ProtectState getmProtectState() {
        return mProtectState;
    }

    public void setmProtectState(ProtectState mProtectState) {
        this.mProtectState = mProtectState;
    }

    public void setmState(State mState) {

        this.mState = mState;
    }

    void openBrake() {
        mState.brakeOpen();
    }

    void closeBrake() {
        mState.brakeClose();
    }

    void openProtect() {
        mState.protectOpen();
    }

    void closeProtect() {
        mState.protectClose();
    }

}

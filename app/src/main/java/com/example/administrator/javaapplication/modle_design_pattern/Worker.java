package com.example.administrator.javaapplication.modle_design_pattern;

import android.util.Log;

import java.util.Date;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/28
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public abstract class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void workOneDay() {
        Log.e("Work:" + name, "------------start------------");
        enterCompany();
        openComputer();
        work();
        closeComputer();
        exitCompany();
        Log.e("Work:" + name, "------------end------------");
    }

    void enterCompany() {
        if (isNeedTime()) {
            Log.e("Work:" + name, new Date().toString() + "进入公司");
        } else {
            Log.e("Work:" + name, "进入公司");
        }

    }

    void openComputer() {
        if (isNeedTime()) {
            Log.e("Work:" + name, new Date().toString() + "打开电脑");
        } else {
            Log.e("Work:" + name, "打开电脑");
        }
    }

    void closeComputer() {
        if (isNeedTime()) {
            Log.e("Work:" + name, new Date().toString() + "关闭电脑");
        } else {
            Log.e("Work:" + name, "关闭电脑");
        }
    }

    void exitCompany() {
        if (isNeedTime()) {
            Log.e("Work:" + name, new Date().toString() + "离开公司");
        } else {
            Log.e("Work:" + name, "离开公司");
        }
    }

    abstract void work();

    boolean isNeedTime() {
        return false;
    }
}

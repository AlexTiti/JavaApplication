package com.example.administrator.javaapplication.modle_design_pattern;

import android.util.Log;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/28
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class HRWorker extends Worker {

    private String name;

    public HRWorker(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void work() {
        Log.e("Work:" + name, "开始看邮件了、、、、、、");
    }
}

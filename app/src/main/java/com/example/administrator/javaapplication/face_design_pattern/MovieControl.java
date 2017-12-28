package com.example.administrator.javaapplication.face_design_pattern;

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

public class MovieControl {
    void movieOpen(){
        Log.e("MovieControl:","OPEN");
    }
    void movieShow(){
        Log.e("MovieControl:","Showing...");
    }
    void closeMovie(){
        Log.e("MovieControl:","CLOSE");
    }
}

package com.example.administrator.javaapplication.face_design_pattern;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/28
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class WatchMovie {
    private LightControl lightControl;
    private MovieControl movieControl;
    private FoodControl foodControl;

    public WatchMovie() {
        this.lightControl = new LightControl();
        this.movieControl = new MovieControl();
        this.foodControl = new FoodControl();
    }

    void watchMovie(){
        lightControl.openLight();
        foodControl.foodOpen();
        foodControl.foodmake();
        movieControl.movieOpen();
        movieControl.movieShow();

    }

    void closeMovie(){
        lightControl.closeLight();
        foodControl.foodClose();
        movieControl.closeMovie();

    }
}

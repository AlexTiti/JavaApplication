package com.example.administrator.javaapplication.ThreadPoolExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * <pre>
 *
 *   @author   :   Alex
 *   @e_mail   :   18238818283@sina.cn
 *   @time     :   2017/12/27
 *   @desc     :
 *   @version  :   V 1.0.9
 */

public class ExecutorUtil {
    private static ExecutorUtil executorUtil;

    private ExecutorUtil() {
    }
    public static ExecutorUtil getExecutorUtil(){
        if (executorUtil == null){
            synchronized (ExecutorUtil.class){
                if (executorUtil == null){
                    executorUtil = new ExecutorUtil();
                }
            }
        }
        return executorUtil;
    }


    private ExecutorService fixedThreadExecutor = Executors.newFixedThreadPool(3);
   private ExecutorService cacheThreadExecutor = Executors.newCachedThreadPool();
   private ExecutorService singleThread =  Executors.newSingleThreadExecutor();
   private ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);


    public ExecutorService getFixedThreadExecutor() {
        return fixedThreadExecutor;
    }

    public ExecutorService getCacheThreadExecutor() {
        return cacheThreadExecutor;
    }

    public ExecutorService getSingleThread() {
        return singleThread;
    }

    public ScheduledExecutorService getScheduled() {
        return scheduled;
    }
}

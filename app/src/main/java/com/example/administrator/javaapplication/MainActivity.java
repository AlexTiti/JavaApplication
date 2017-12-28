package com.example.administrator.javaapplication;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.administrator.javaapplication.ThreadPoolExecutor.ExecutorUtil;
import com.example.administrator.javaapplication.pingme.CommonConstants;
import com.example.administrator.javaapplication.pingme.PingService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private Cart mCart;
    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCart = new Cart(this);

    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.button:
                mCart.openBrake();
                break;
            case R.id.button2:
                mCart.closeBrake();
                break;
            case R.id.button3:
                mCart.openProtect();
                break;
            case R.id.button4:
                mCart.closeProtect();
                break;
            case R.id.notify_button:
                //number ++;
                Intent intent = new Intent(this,NavigationActivity.class);
                TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
                stackBuilder.addParentStack(NavigationActivity.class);
                stackBuilder.addNextIntent(intent);
                NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"1");
                builder.setSmallIcon(R.drawable.ic_home_black_24dp).setContentTitle("Notification").setContentText("This is a notification"+ number).setNumber(number++);

                PendingIntent pendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                builder.setDefaults(NotificationCompat.DEFAULT_ALL);
                builder.setAutoCancel(true);
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                manager.notify(1,builder.build());
                break;
            case R.id.button_big:
                Intent intent_big = new Intent(this, PingService.class);
                intent_big.setAction(CommonConstants.ACTION_PING);
                intent_big.putExtra(CommonConstants.EXTRA_MESSAGE,"AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                startService(intent_big);
                break;

            case R.id.button_progress:
                //setProgressNotify();
                testThreadPool();
                break;
            default:
                break;
        }
    }

    private void testThreadPool() {
       // ExecutorService service = ExecutorUtil.getExecutorUtil().getCacheThreadExecutor();
        ScheduledExecutorService service = ExecutorUtil.getExecutorUtil().getScheduled();
        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                Log.e("Thread====",Thread.currentThread().getName()+"=="+Thread.activeCount());

            }
        };
        for (int i=0;i<10;i++){
            //service.scheduleAtFixedRate(runnable,1,3, TimeUnit.SECONDS);

        }

    }

    private void setProgressNotify() {
        final NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"");
        builder.setSmallIcon(R.drawable.ic_stat_notification).setContentTitle(getString(R.string.app_name)).setContentText("Downing...")
                .setAutoCancel(true);
       final NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                int number_progress = 0;
                for (;number_progress<50;number_progress+=5){
                    builder.setProgress(50,number_progress,true);
                    //builder.setProgress(50,number_progress,false);
                    manager.notify(1,builder.build());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                builder.setContentText("Down Complete");
                builder.setProgress(0,0,false);
                manager.notify(1,builder.build());
            }
        }).start();

    }
}

package com.example.hu_15_notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel= new NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(CHANNEL_DEC);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }

int id=0;

    //step-1//
        /*Notifiaction Channel
        * CHANNEL_ID
        * CHANNEL_NAME
        * CHANNEL_DISCRIPTION*/

    /*NOTIFICATION BULIDER*/


/* step*/
    /*2 - TO CREATE A NOTIFICATION WE NEED TO CREATE NOTIFICSTION BUILDER*/

    /* step*3*/
    /* NOTIFICATION MANAGER*/

    public static final  String CHANNEL_ID="CHANNEL_ID";
    public static final String CHANNEL_NAME="CHANNEL_NAME";
    public static final String CHANNEL_DEC="CHANNEL_DISCRIPTION";


    public void notifiation_show(View view) {
//step-2
        NotificationCompat. Builder nbuilder = new NotificationCompat.Builder(this,CHANNEL_ID);

        nbuilder.setContentTitle("Dangres");
        nbuilder.setContentText("plz remove instagram");
        nbuilder.setSmallIcon(R.drawable.ic_launcher_background);
        nbuilder.setPriority(NotificationManagerCompat.IMPORTANCE_DEFAULT);


// step-3
      NotificationManager manager =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
      manager.notify(id,nbuilder.build());
      id++;
    }

}

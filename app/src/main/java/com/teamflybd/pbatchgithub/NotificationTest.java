package com.teamflybd.pbatchgithub;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationTest extends AppCompatActivity {

    Button simple,bigP,bigT,action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);
        initialization();

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleN();
            }
        });
        bigP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigPicture();
            }
        });
        bigT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bigText();
            }
        });
        action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                actionN();
            }
        });
    }



    private void initialization() {
        simple = findViewById(R.id.simple);
        bigP = findViewById(R.id.bPicture);
        bigT = findViewById(R.id.bText);
        action = findViewById(R.id.action);
    }

    private void simpleN()
    {
        int nId = 0;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.bike)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bike))
                .setContentTitle("Android Course")
                .setContentText("Brief description of android course")
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());
    }
    private void actionN() {
        int nId = 5;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.bike)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bike))
                .setContentTitle("Android Course")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("Click to visit google"))
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        builder.addAction(R.drawable.a,"VIEW", pendingIntent);
        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());
    }

    private void bigText() {
        int nId = 1;
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.bike)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bike))
                .setContentTitle("Android Course Big Picture")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("I am big text"))
                .setAutoCancel(true);

        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());
    }

    private void bigPicture() {
        int nId = 2;
        Bitmap picture = BitmapFactory.decodeResource(getResources(), R.drawable.bike);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.bike)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.bike))
                .setContentTitle("Android Course Big Picture")
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(picture))
                .setAutoCancel(true);


        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());
    }
}

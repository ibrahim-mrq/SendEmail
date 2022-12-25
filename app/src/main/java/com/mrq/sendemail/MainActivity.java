package com.mrq.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mrq.email.SendEmailAddress;

public class MainActivity extends AppCompatActivity {

    private static final String username = "";
    private static final String password = "";
    private static final String toEmailList = "abo.mahroq@gmail.com,abo.mahroq@gmail.com";
    private static final String emailSubject = "subject";
    private static final String emailBody = "Body";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SendEmailAddress address = new SendEmailAddress();
        address.setListEmailReceiver(toEmailList);
        address.setEmailSubject(emailSubject);
        address.setEmailBody(emailBody);
        address.sendEmail(this, username, password);

    }
}
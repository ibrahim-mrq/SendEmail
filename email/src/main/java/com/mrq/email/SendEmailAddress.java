package com.mrq.email;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmailAddress {

    private ProgressDialog progress;

    private String listEmailReceiver = "";
    private String emailSubject = "";
    private String emailBody = "Hello";

    private Boolean state = false;
    private String error = "";

    private String enableAuth = "true";
    private String enableStarttls = "true";
    private String host = "smtp.gmail.com";
    private String port = "587";

    public void sendEmail(Context context, String emailSender, String passwordSender) {
        showProgress(context);
        Handler handler = new Handler(message -> {
            onDone(context, state);
            return false;
        });
        new Thread(() -> {
            try {
                Properties props = new Properties();
                props.put("mail.smtp.auth", enableAuth);
                props.put("mail.smtp.starttls.enable", enableStarttls);
                props.put("mail.smtp.host", host);
                props.put("mail.smtp.port", port);
                Session session = Session.getInstance(props,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(emailSender, passwordSender);
                            }
                        });
                try {
                    Message message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(emailSender));
                    message.setRecipients(Message.RecipientType.BCC,
                            InternetAddress.parse(listEmailReceiver));
                    message.setSubject(emailSubject);
                    message.setText(emailBody);
                    Transport.send(message);
                    state = true;
                } catch (MessagingException e) {
                    e.printStackTrace();
                    error = e.getLocalizedMessage();
                    Log.e("response", "MessagingException = " + e.getLocalizedMessage());
                    state = false;
                }
                handler.sendEmptyMessage(0);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("response", "Exception = " + e.getLocalizedMessage());
            }
        }).start();
    }

    private void onDone(Context context, boolean state) {
        Log.e("response", "state = " + state);
        dismissProgress();
        String title;
        String message;
        if (state) {
            title = "";
            message = "Email has been sent successfully";
        } else {
            title = "Failed to send email";
            message = error;
        }
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(android.R.string.ok, (dialog, which) -> {
                    dialog.dismiss();
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }

    private void showProgress(Context context) {
        progress = new ProgressDialog(context);
        progress.setTitle("Loading...");
        progress.setMessage("Please wait, email is being sent...");
        progress.setCancelable(false);
        progress.setCanceledOnTouchOutside(false);
        progress.show();
    }

    private void dismissProgress() {
        if (progress != null) {
            progress.dismiss();
            progress = null;
        }
    }

    public String getListEmailReceiver() {
        return listEmailReceiver;
    }

    public void setListEmailReceiver(String listEmailReceiver) {
        this.listEmailReceiver = listEmailReceiver;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public Boolean getState() {
        return state;
    }

    public String getEnableAuth() {
        return enableAuth;
    }

    public void setEnableAuth(String enableAuth) {
        this.enableAuth = enableAuth;
    }

    public String getEnableStarttls() {
        return enableStarttls;
    }

    public void setEnableStarttls(String enableStarttls) {
        this.enableStarttls = enableStarttls;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getError() {
        return error;
    }
}

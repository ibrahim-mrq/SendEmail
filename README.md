[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress?ref=badge_shield) [![](https://jitpack.io/v/ibrahim-mrq/SendEmail.svg)](https://jitpack.io/#ibrahim-mrq/SendEmail) [![API](https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=21)



## Description

You can send an email without going to the email application through the application, but you have to change some security settings within the Gmail account.

## Getting Started
These instructions will help you set up this library easily on your current project and working in no time. You only need a few configurations to start working!
<br/>


## Installing
To be able to use the following library, you will need to add the following gradle dependency in your
<br/>
1. build.gradle Project level

```
maven { url "https://jitpack.io" }
```
2. build.gradle module

```
implementation 'com.github.ibrahim-mrq:mrq:SendEmailAddress::1.0.1'
implementation 'com.github.ibrahim-mrq:SendEmail:1.0.2'

```
or
   
```
 implementation project(path: ':email')
 ```
## Using
  java
  
``` java

    private static final String username = "";
    private static final String password = "";
    private static final String toEmailList = "";
    private static final String emailSubject = "";
    private static final String emailBody = "";
```

``` java
   SendEmailAddress address = new SendEmailAddress();
        address.setListEmailReceiver(toEmailList);
        address.setEmailSubject(emailSubject);
        address.setEmailBody(emailBody);
        address.sendEmail(this, username, password);
```

<br/>

## Call us
[whatsapp](https://wa.me/+972592440530 "whatsapp"), [facebook](https://www.facebook.com/abu.mahroq/ "facebook"), [linkedin](https://www.linkedin.com/in/ibrahim-mrq/ "linkedin"), [other](https://linktr.ee/ibrahim_mrq "other"), Email: abo.mahroq@gmail.com
<br/>


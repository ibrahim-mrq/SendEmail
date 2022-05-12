[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress?ref=badge_shield) [![](https://jitpack.io/v/ibrahim-mrq/SendEmailAddress.svg)](https://jitpack.io/#ibrahim-mrq/SendEmailAddress)


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
implementation 'com.github.ibrahim-mrq:mrq:SendEmailAddress::1.0.0'
```
or
   
```
 implementation project(path: ':SendEmailAddress')
 ```
 
<br/>

  java
  
``` java

   SendEmailAddress address = new SendEmailAddress();
        address.setListEmailReceiver(toEmailList);
        address.setEmailSubject(emailSubject);
        address.setEmailBody(emailBody);
        address.sendEmail(this, username, password);
    
```
<br/>


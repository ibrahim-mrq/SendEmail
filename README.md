[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fibrahim-mrq%2FSendEmailAddress?ref=badge_shield) [![](https://jitpack.io/v/ibrahim-mrq/SendEmail.svg)](https://jitpack.io/#ibrahim-mrq/SendEmail)



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
```
or
   
```
 implementation project(path: ':email')
 ```

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

## License

``` java

Copyright 2015 lujun

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

[https://www.apache.org/licenses/LICENSE-2.0](https://www.apache.org/licenses/LICENSE-2.0 "https://www.apache.org/licenses/LICENSE-2.0")

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
<br/>


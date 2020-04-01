# Java-SMS-API-using-Twilio
SMS Notification or Messaging through Twilio

Everyone might be already familiar with Notifications and especially through Email since ,many web application will be integrated with notification as email by default & the cost of the email service providers like outlook, zoho, yahoo etc. will be based on monthly or early basis. And also many other providers may give free service as trial like Google etc. For one of the email notification integration using Gmail you can refer the repo [https://github.com/Sudarshan-Gowda/Spring-Mvc-Java-Mail-API];

In the same way if we want to integrate yoyr application with SMS communication as well means its bit of cost since SMS service providers will charge basis on number of sms packages or even in monthly basis as well. But as a programmer if you want to learn and integrate with your trail application with it means can use many sms providers with trail version just for testing. And remember in trail version you may not be accessible for all the features.

Now come to the point, this repo is integrated with twilio [https://www.twilio.com/] sms providers, they have many features like sms, voice call, video call etc. In this repo you can find the feature of sending sms to the pre-verified user numbers (since it’s a trial account). Once u done with sign-up, go to the console url [https://www.twilio.com/console/phone-numbers/verified] to pre-register the number.

<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture1.png" width="600px;"/>

Once to go the dashboard you can see the TRAIN NUMBER, ACCOUNT SID, AUTH TOKEN ect,  which we will be using for integration.

<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture2.png" width="600px;"/>

So far setup is done, Now its time to check-out and look into the repository, You can clone this repo by using command ``git clone https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio.git ``

Do the maven clean and updates. You can find the dependency’s inside pom.xml for the twilo which we will be using for communication.
Now it’s time to configure the authentication token which is provided by twilio as below,

<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture5.png" width="600px;"/>

Once configuration is done, you can pass the telephone number and message body to which you need to send notification. Once that is done, do run as java application, So far if you followed all the steps means you will receive notification to your mobile or the number which you passed as to number as below.

<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture3.png" height="400px;"/>

You can also find the other util functions to fetch the list of messages you sent with delivery status as below.
<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture6.png" width="600px;"/>
<img src="https://github.com/Sudarshan-Gowda/Java-SMS-API-using-Twilio/blob/master/docs/Picture4.png"/>



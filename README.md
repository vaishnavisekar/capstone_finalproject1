# capstone_finalproject1

Description:
Use the link - https://www.saucedemo.com/
Write an automation script using Selenium to buy a product successfully on the website. Important points to be implemented are –
Create a new Maven project.
1. Open the website using https://www.saucedemo.com/
2. Enter username and password as mentioned below in the website.
3. Click on login and a list of different products will be displayed.
4. Click on "Add to Cart" of any product.
5. Click on Add to Cart symbol which is at the right-side corner of the page.
6. Click on checkout and then enter your details. 7. Click on Continue and then Click on Finish.
A page that will be displayed with "Thank you for your Order."
  
 Perform Load testing using JMeter and do the following steps –
Record a flow on the above website using Blazemter plugin. Download .jmx file.
Import this .jmx file in JMeter, add Listeners and run the script to make sure that there are no Red Requests (failed requests). Delete failed requests from the recorded script.
After everything is working fine, remove all the listeners.
Upload this recorded script on Blazemeter cloud and run the script from 20 minutes with 50 Virtual Users (this is the max limit you get under free account).
A report will be generated, verify that ‘Throughput’ must not be decreasing with time. It can be constant or it can increase but is should not decrease.
Errors percentage should not increase with time.
Take a screenshot of above report and use it for submission.

Perform the API testing using Postman and follow the below steps –
Use https://gorest.co.in/ as the end-point to test the APIs. Make sure you are using Bearer Token to work on this website.
First send a POST request to create a user.
Then send a GET request to verify the user has been created. Update the same user using PUT request.
Delete the above user using Delete request.

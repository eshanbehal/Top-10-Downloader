              

                Hey guys just starting with the new app TOP 10 DOWNLOADER.
           ==================================================================

1. Basic aim for my app is to process an RSS feed and then display the data on the phone screen.

2. Under this app i will be downloading data over the internet , run task in the background using the ASYNCTask
   nd parsing xml file to extract data from the downloaded feed.

3. RSS - Rich site summary or Really simple syndication.

   But basically RSS is a way to present web data in a standard format so that the users can subscribe to the
   RSS feed and recieve updates automatically.

   IT itself in general is not a full information ie it generally contains summary.


     12th june
   ==============

1. jst started off today with the ASYNCTASK- used to perform the download on the seperate thread and get notified
   when the download is finished.
   so it prevents the freezing in the device.

2. here i am starting with firstly creating a new class for the Asynctask activity but not a new class page
   creating it as a subclass within the main class as it will not be used by anything else.

3. here i am taking the advantage of the asynchronous processing that the android framework provides us with.

   so we jst have to type the code for the implementation rest is all handeled by the android studio.

4. here i will be using three parameters for the asynctask processing nd will be taking advantage of all.

   more on the AsyncTask can be read here : https://developer.android.com/reference/android/os/AsyncTask.html

5. jst added some more code in my java class for the implementtation of the asynctask.Used many types of code while 
   writing code for this app like log.t , log.d , log.e.
   in some places used log.e instead of log.d as we are using it here for the errors not for debugging process.
   
6. here used the concept of the buffered reader - that buffers the inputstreamreader and it is the buffered reader
   that will be actually used to read the xml.
   here the input stream reader uses the input object as the source of its data and the input stream is created from
   our open http connection.

   more info on Bufferred reader can be read here : https://developer.android.com/reference/java/io/BufferedReader.html

7. other things used in my app are the permissions for the internet connection inorer to retrive data from the web and also 
   wrote code for some exception in order to make my app crash free.worked on the exceptions like Malformedurlexception , 
   IOexception etc.

   more info on the permissions can be seen from here : https://developer.android.com/guide/topics/permissions/overview

8. at end jst added some new classes to the java code in order to feed the data retrieved from the xml pages and also used
   xml pull parsers in the java classes ...

   more info regarding xml pullparser can be read here : https://developer.android.com/reference/org/xmlpull/v1/XmlPullParser.html


    13th june
  =============

1. starting today by adding some more code to the while loop in the pull parser for the xmlpullparser class.
   adding some tag like start_tag , text , end_tag with the help of switch and if statements.

2. After putting code for xmlpullparser now will be creating the laout for my app inorder to display the rssfeed 
   data.
   So here i have used a listview widget for scrolling inbetween the data for multiple records.

3. also i will be using the concept of adaptors for my app.
   using adapters as to make the listview work , we have to put an adapter between the data and the listview.
   
   whenevr the listview needs to display any data, it asks the adapters for a view that it can display data on.

4. here i am using the arrayadapter thats the part of the android framework.

   ArrayAdapters: it is very basic it can put data into a single textview widget.it uses objects "tostring" method
   and puts the returned string into the the textview.

   for more info on ArrayAdapters view this link : https://developer.android.com/reference/android/widget/ArrayAdapter.html 

5. added code for the layout inflater and context for the app in new java class feed adapter.

   more info on CONTEXT : https://developer.android.com/reference/android/content/Context.html

   more info on layoutinflater : https://developer.android.com/reference/android/view/LayoutInflater.html

 
















              will be adding more info in the process of creating this app stay tuned....:)




      

         BY ESHAN_BEHAL.
       ================== 
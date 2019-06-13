package eshanbehal.e.top10downloader;

import android.util.Log;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.StringReader;
import java.util.ArrayList;



public class ParseApplication {
    private static final String TAG = "ParseApplications";
    private ArrayList<FeedEntry> applications;

    public ParseApplication() {
        this.applications = new ArrayList<>();
    }

    public ArrayList<FeedEntry> getApplications() {
        return applications;
    }

    public boolean parse(String xmlData) {
        boolean status = true;
        FeedEntry currentRecord = null;
        boolean inEntry = false;
        String textValue = "";

        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser xpp = factory.newPullParser();
            xpp.setInput(new StringReader(xmlData));
            int eventType = xpp.getEventType();
            while(eventType != XmlPullParser.END_DOCUMENT) {
                String tagName = xpp.getName();
                switch (eventType){

                    case XmlPullParser.START_TAG:
                        Log.d(TAG, "parse: starting tag for : " + tagName);
                        if ("entry".equalsIgnoreCase(tagName)){
                            inEntry = true;
                            currentRecord = new FeedEntry();
                        }
                        break;
                        
                    case XmlPullParser.TEXT:
                        textValue = xpp.getText();
                        break;
                        
                        case XmlPullParser.END_TAG:
                            Log.d(TAG, "parse: Ending tag for : " + tagName);
                            if (inEntry){
                                if ("entry".equalsIgnoreCase(tagName)){
                                    applications.add(currentRecord);
                                    inEntry = false;
                                }
                                else if ("name".equalsIgnoreCase(tagName)){
                                    currentRecord.setName(textValue);
                                }
                                else if ("artist".equalsIgnoreCase(tagName)){
                                    currentRecord.setName(textValue);
                                }
                                else if ("releaseDate".equalsIgnoreCase(tagName)){
                                    currentRecord.setName(textValue);
                                }
                                else if ("summary".equalsIgnoreCase(tagName)){
                                    currentRecord.setName(textValue);
                                }
                                else if ("image".equalsIgnoreCase(tagName)){
                                    currentRecord.setName(textValue);
                                }
                            }
                            break;
                        
                        default:
                            //nothing else to do.
                }
                eventType = xpp.next();

            }
            for (FeedEntry app: applications){
                Log.d(TAG, "***********************");
                Log.d(TAG, app.toString());
            }

        } catch(Exception e) {
            status = false;
            e.printStackTrace();
        }

        return status;
    }
}

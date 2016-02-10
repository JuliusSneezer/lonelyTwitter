package ca.ualberta.cs.lonelytwitter;

import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.ViewAsserts;
import android.widget.TextView;

/**
 * Created by sajediba on 2/8/16.
 */
public class IntentReaderActivityTest extends ActivityInstrumentationTestCase2{

    public IntentReaderActivityTest() {
        super(IntentReaderActivity.class);
    }

    //
    //
    public void testSendtext(){
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 1");
        setActivityIntent(intent);
        IntentReaderActivity lra = (IntentReaderActivity) getActivity();
        assertEquals("IntentReaderActivity should get the text from intent", "message 1",  lra.getText());

    }
    //
    //
    public void testDisplayText(){
        Intent intent =new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 2");
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();
        TextView textView = (TextView) ira.findViewById(R.id.intentText);
        assertEquals("The text should be displayed", "message 4",textView.getText() );
    }
    public void testDoubleText() {
        Intent intent = new Intent();
        intent.putExtra(IntentReaderActivity.TEXT_TO_TRANSFORM_KEY, "message 3");
        intent.putExtra(IntentReaderActivity.MODE_OF_TRANSFORM_KEY, IntentReaderActivity.DOUBLE);
        setActivityIntent(intent);
        IntentReaderActivity ira = (IntentReaderActivity) getActivity();
        assertEquals("The texts should be repeated twice", "message 3", ira.getText());
    }



    //TODO: Add your code here ...
//-------------------------------------------------------------------------------

//-------------------------------------------------------------------------------
}

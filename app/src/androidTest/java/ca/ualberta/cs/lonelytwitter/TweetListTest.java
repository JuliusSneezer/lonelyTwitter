package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by wang8 on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2{
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }
    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));


    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        tweets.hasTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));




    }
    public void testDeleteTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        tweets.deleteTweet(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");
        tweets.add(tweet);
        Tweet returnTweet = tweets.getTweet(0);
        assertEquals(returnTweet.getMessage(), tweet.getMessage());
        assertEquals(returnTweet.getDate(),tweet.getDate());



    }
    public void testGetTweets() {
        TweetList tweets = new TweetList();
        Tweet tweet2 = new NormalTweet("test2");
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.add(tweet2);
        assertNotSame(tweets.getTweets(), tweets);


    }
    public void testGetCount() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test1");
        tweets.add(tweet);
        tweets.add(tweet1);
        assertEquals(tweets.getCount(), 2);

    }
}

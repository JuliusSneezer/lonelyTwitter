package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.lang.Comparable;
import java.util.Comparator;
/**
 * Created by wang8 on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets= new ArrayList<Tweet>();
    public void add(Tweet tweet) {

        for (Tweet temp: tweets){
            if (tweet == temp){
                throw new IllegalArgumentException();

            }
        }
        tweets.add(tweet);


    }
    public ArrayList getTweets() {
        ArrayList<Tweet> sortedtweets = tweets;
        Tweet temp = new NormalTweet("temp");
        for (int i = 0; i < sortedtweets.size(); i++) {
            for (int j = 0; j < sortedtweets.size(); j++) {
                if (sortedtweets.get(i).getDate().before(sortedtweets.get(j).getDate())) {
                    temp = sortedtweets.get(i);
                    sortedtweets.set(i, sortedtweets.get(j));
                    sortedtweets.set(j, temp);
                }


            }
        }
        return sortedtweets;
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
    public void removeTweet(Tweet tweet){
        tweets.remove(tweet);
    }
    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
    public int getCount() {
        return tweets.size();



    }

    public void deleteTweet(Tweet tweet){
        tweets.remove(tweet);

    }
}

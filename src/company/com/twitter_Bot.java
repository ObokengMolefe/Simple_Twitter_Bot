package company.com;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class twitter_Bot {
    public static void main(String[] Args)
    {
        tweetBot();
    }
    public static void tweetBot(){
        Twitter twitter = TwitterFactory.getSingleton();
        String myTweet = "Twitter_Bot Testing";

        try {
            Status status = twitter.updateStatus(myTweet);
            System.out.println("Successful" + status.getText());
        } catch (TwitterException e) {
            e.printStackTrace();
        }
    }
}
package twitterApi.Service;

import org.springframework.stereotype.Component;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitterApi.model.TwitterModel;

import java.util.ArrayList;
import java.util.List;

@Component("TW")
public class TwitterInterfaceImpl implements TwitterInterface {

    Twitter twitter = TwitterFactory.getSingleton();

    public List<TwitterModel> get() throws TwitterException {

        List<TwitterModel> temp = new ArrayList<>();
        List<Status> s = twitter.getHomeTimeline();

        for(Status st:s) {

            TwitterModel t = new TwitterModel(st.getText(), st.getUser().getName(), st.getUser().getScreenName(), st.getUser().getProfileImageURL(), st.getCreatedAt());

            temp.add(t);
        }
        return temp;

    }



    public String post(String tweet) throws TwitterException {

        twitter.updateStatus(tweet);
        return "tweeted from class 1";
    }
}


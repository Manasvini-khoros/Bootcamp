package twitterApi.controller;

import org.springframework.web.bind.annotation.*;
import twitter4j.TwitterException;
import twitterApi.Service.TwitterService;
import twitterApi.model.TwitterModel;

import java.util.List;

@RestController
@RequestMapping("/Twitter")
public class TwitterController {


    //Twitter twitter = TwitterFactory.getSingleton();

     TwitterService t = new TwitterService();

    @GetMapping("/TimeLine")
    public List<TwitterModel> getTimeline() throws TwitterException{

         return t.getFeed();
        //System.out.println("doneee");

    }

    @PostMapping("/postTweet/{tweet}")
    public String postTweet(@PathVariable(value = "tweet") String tweet) throws TwitterException {

        return t.postMessage(tweet);


    }
}


package com.ddouglss.springsecurity.controller;

import com.ddouglss.springsecurity.data.dto.CreateTweetDto;
import com.ddouglss.springsecurity.entities.Tweet;
import com.ddouglss.springsecurity.repository.TweetRepository;
import com.ddouglss.springsecurity.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TweetController {

    private final TweetRepository tweetRepository;
    private final UserRepository userRepository;

    public TweetController(TweetRepository tweetRepository, UserRepository userRepository) {
        this.tweetRepository = tweetRepository;
        this.userRepository = userRepository;
    }

    @PostMapping("/tweets")
    public ResponseEntity<Void> createTweet(@RequestBody CreateTweetDto dto, JwtAuthenticationToken token) {

        var users = userRepository.findById(UUID.fromString(token.getName()));
        var tweet = new Tweet();
        tweet.setUser(users.get());
        tweet.setContent(dto.content());
        tweetRepository.save(tweet);
        return ResponseEntity.ok().build();
    }
}

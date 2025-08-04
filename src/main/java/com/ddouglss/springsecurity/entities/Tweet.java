package com.ddouglss.springsecurity.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "tb_tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long tweetId;

    private User user;

    private String content;

    @CreationTimestamp
    private Instant creationTimestamp;
}

package com.ddouglss.springsecurity.repository;

import com.ddouglss.springsecurity.entities.Tweet;
import com.ddouglss.springsecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
}

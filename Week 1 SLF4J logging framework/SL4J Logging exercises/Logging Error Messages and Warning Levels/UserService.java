package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {

    // Create logger object
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public void login(String username) {

        if (username == null || username.isEmpty()) {

            logger.error("Username cannot be empty!");

            return;
        }

        if (username.length() < 4) {

            logger.warn("Username is very short.");

        }

        logger.info("User {} logged in successfully.", username);

    }

}
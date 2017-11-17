package com.humblewebdev.oauth2demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api");
public class OAuth2ApiController {
    public static final Logger logger = LoggingFactory.getLogger(OAuth2ApiController.class);
}

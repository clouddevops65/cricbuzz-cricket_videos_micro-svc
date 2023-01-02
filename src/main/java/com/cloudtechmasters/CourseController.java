package com.cloudtechmasters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@RestController
public class CourseController {
    private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
//create two endpoints getAllVideos and getPlaylists
    @GetMapping("/")
    public List<String> getAllVideos(){
        logger.info("added for failing sonar build");
        return Arrays.asList("All Cricket Videos");
    }

    @GetMapping("/playlists")
    public List<String> getPlaylists(){
        return Arrays.asList("IPL 2022 videos, India tour of Bangladesh,2022, Sri Lanka Tour of India, 2023");
    }

}

package com.me.storyhubuserregistrationbackend.dictionary;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("dictionary")
public class GenderController {

    @GetMapping("gender")
    public void getGender() {

    }
}

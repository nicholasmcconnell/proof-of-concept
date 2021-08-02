package com.nickdemos.services;

import org.springframework.stereotype.Service;

@Service
public class MotivationService {

    public String getMotivation(){
        return "Here is your motivation - boop.";
    }
}

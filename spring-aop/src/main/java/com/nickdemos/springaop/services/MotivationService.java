package com.nickdemos.springaop.services;

import org.springframework.stereotype.Service;

@Service
public class MotivationService {

    public String getMotivation() {
        // Pretend this queries some motivation quotes API (hard coded value for brevity)
        return "Don't quit. Suffer now and live the rest of your life like a champion. - Muhammad Ali";
    }

}

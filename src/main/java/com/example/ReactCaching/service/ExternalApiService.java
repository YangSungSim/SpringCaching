package com.example.ReactCaching.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ExternalApiService {

    public String getUserName(String userId) {

        // 외부 서비스나 DB 호출

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        System.out.println("Getting user name from other service...");

        if(userId.equals("A")) {
            return "Adam";
        }

        if(userId.equals("B")) {
            return "Bob";
        }

        return "";

    }

    //캐시로 자동 지정해줄 수 있는 기능
    @Cacheable(cacheNames = "userAge", key = "#userId")
    public int getUserAge(String userId) {

        // 외부 서비스나 DB 호출

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {

        }

        System.out.println("Getting user name from other service...");

        if(userId.equals("A")) {
            return 28;
        }

        if(userId.equals("B")) {
            return 32;
        }

        return 0;

    }

}

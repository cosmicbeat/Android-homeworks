package com.softuni.recviewdemo.data;

import java.util.Arrays;
import java.util.List;

public class gag {

    private static List database;

    public static List getDatabase() {
        if(database == null) {
            database = generateData();
        }
        return database;
    }

    private static List generateData() {
        return Arrays.asList(
                new Accessory(
                        "sleep",
                        "I am going to sleep early tonight.",
                        "https://img-9gag-fun.9cache.com/photo/a6oo2eA_700bwp.webp"),
                new Accessory("Why not both?",
                        "The difference between man and woman",
                        "https://img-9gag-fun.9cache.com/photo/a477AOv_700bwp.webp"),
                new Accessory("Happy womens day",
                        "A good wife always balances your life",
                        "https://img-9gag-fun.9cache.com/photo/a477AOv_700bwp.webp"),
                new Accessory(
                        "sleep",
                        "I am going to sleep early tonight.",
                        "https://img-9gag-fun.9cache.com/photo/a6oo2eA_700bwp.webp"),
                new Accessory("Why not both?",
                        "The difference between man and woman",
                        "https://img-9gag-fun.9cache.com/photo/a477AOv_700bwp.webp"),
                new Accessory("Happy womens day",
                        "A good wife always balances your life",
                        "https://img-9gag-fun.9cache.com/photo/a477AOv_700bwp.webp")

        );
    }
}

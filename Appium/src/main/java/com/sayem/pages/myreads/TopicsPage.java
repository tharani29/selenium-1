package com.sayem.pages.myreads;

public class TopicsPage {
    private static TopicsPage ourInstance = new TopicsPage();

    public static TopicsPage getInstance() {
        return ourInstance;
    }

    private TopicsPage() {
    }
}

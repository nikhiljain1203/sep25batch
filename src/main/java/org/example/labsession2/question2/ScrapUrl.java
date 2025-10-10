package org.example.labsession2.question2;

import java.util.concurrent.Callable;

public class ScrapUrl implements Callable<Void> {
    private String url;

    public ScrapUrl(String url) {
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("Scraping URL: " + url +
                " by " + Thread.currentThread().getName());
        // Simulate scraping with sleep
        Thread.sleep(200);
        System.out.println("Finished scraping URL: " + url +
                " by " + Thread.currentThread().getName());
        return null;
    }
}

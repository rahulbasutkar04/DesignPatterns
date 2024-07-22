package com.rbtech.designpatterns.behavioural.observer2;

public class Main {
    public static void main(String[] args) {
        // lets create first user

        User1 user1=new User1();
        User2 user2=new User2();
        User3 user3=new User3();

        // lets creare an channels

        YoutubeChannel1 youtubeChannel1=new YoutubeChannel1();
        YoutubeChannel2 youtubeChannel2 =new YoutubeChannel2();

        // now lets the users subscribe the youtube channel

        youtubeChannel1.subscribe(user1);
        youtubeChannel1.subscribe(user2);  // here two users are subsribed to this channel

        youtubeChannel1.newVideoAdded("New Video added from channel 1");

        // lets do for the channel 2 also


        youtubeChannel2.subscribe(user3);
        youtubeChannel2.newVideoAdded("New Video add from chnnel 2");

    }
}

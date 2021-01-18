package com.designpattern.observer;

import com.designpattern.observer.interfaces.Observer;
import com.designpattern.observer.models.EmailTopic;
import com.designpattern.observer.models.EmailTopicSubscriber;

public class Main {
    public static void main(String[] args){
        EmailTopic emailTopic = new EmailTopic();

        //create observer
        Observer firstObserver = new EmailTopicSubscriber("firstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        //attaching observer to subject
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        //check for updates
        firstObserver.update();

        //provide subject/broadcast
        emailTopic.postMessage("Hello Subscribers!");

        emailTopic.unRegister(firstObserver);

        emailTopic.postMessage("Hello Subscribers! Again");


    }
}

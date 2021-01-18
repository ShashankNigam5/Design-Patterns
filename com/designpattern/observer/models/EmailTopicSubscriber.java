package com.designpattern.observer.models;

import com.designpattern.observer.interfaces.Observer;
import com.designpattern.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name + " no new message on this topic");
        }else{
            System.out.println(name + " Retreiving message : " +msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}

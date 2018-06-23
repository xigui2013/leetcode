package com.wjw.mediator;

/**
 * @author shulu.wjw
 * @date 下午8:05 2018/6/23
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}

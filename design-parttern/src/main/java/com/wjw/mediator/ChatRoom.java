package com.wjw.mediator;

import java.util.Date;

/**
 * @author shulu.wjw
 * @date 下午8:05 2018/6/23
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "]:" + message);
    }
}

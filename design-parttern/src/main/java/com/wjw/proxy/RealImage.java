package com.wjw.proxy;

/**
 * @author shulu.wjw
 * @date 下午5:24 2018/6/22
 */
public class RealImage implements Image {

    public String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(fileName);
    }

    public void loadImageFromDisk(String fileName) {
        System.out.println("loading " + fileName);

    }

    @Override
    public void display() {
        System.out.println("Display " + fileName);
    }
}

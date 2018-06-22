package com.wjw.chain;

/**
 * @author shulu.wjw
 * @date 上午12:02 2018/6/23
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger:" + message);
    }
}

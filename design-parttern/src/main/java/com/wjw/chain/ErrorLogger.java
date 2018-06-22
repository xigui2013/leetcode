package com.wjw.chain;

/**
 * @author shulu.wjw
 * @date 上午12:01 2018/6/23
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:" + message);
    }
}

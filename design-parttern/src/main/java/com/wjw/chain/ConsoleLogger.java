package com.wjw.chain;

/**
 * @author shulu.wjw
 * @date 下午11:59 2018/6/22
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::logger:" + message);
    }
}

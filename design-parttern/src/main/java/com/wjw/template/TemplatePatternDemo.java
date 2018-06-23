package com.wjw.template;

/**
 * @author shulu.wjw
 * @date 下午10:47 2018/6/23
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

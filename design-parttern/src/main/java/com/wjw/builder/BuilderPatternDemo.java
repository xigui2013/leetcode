package com.wjw.builder;

/**
 * @author shulu.wjw
 * @date 上午12:10 2018/6/21
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost : " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost : " + nonVegMeal.getCost());
    }
}

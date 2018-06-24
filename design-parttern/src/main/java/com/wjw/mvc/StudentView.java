package com.wjw.mvc;

/**
 * @author shulu.wjw
 * @date 上午10:43 2018/6/24
 */
public class StudentView {

    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student:");
        System.out.println("Name:" + studentName);
        System.out.println("Roll No:" + studentRollNo);
    }
}

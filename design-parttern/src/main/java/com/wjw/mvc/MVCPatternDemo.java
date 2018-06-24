package com.wjw.mvc;

/**
 * @author shulu.wjw
 * @date 上午10:48 2018/6/24
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}

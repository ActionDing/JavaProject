package com.ding.annotation;

/**
 * 子类
 *
 */
@CustomDescription(description = "学生")
public class Student extends Person {
    private String StudentId;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String studentId) {
        StudentId = studentId;
    }

    public String StudentPublicMethod(String str) {
        return str;
    }

    private String StudentPrivateMethod(String str) {
        return str;
    }

    public Student(String name, String studentId) {
        super(name);
        StudentId = studentId;
    }

    public Student(String studentId) {
        StudentId = studentId;
    }

    public Student() {
    }
}

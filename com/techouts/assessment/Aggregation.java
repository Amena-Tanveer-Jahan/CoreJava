package com.techouts.assessment;

public class Aggregation {

    static class Course {
        String title;

        Course(String title) {
            this.title = title;
        }
    }

    static class Student {
      String name;
        Course enrolledCourse;

        Student(String name, Course enrolledCourse) {
            this.name = name;
            this.enrolledCourse = enrolledCourse;
        }


        Course getEnrolledCourse() {
            return enrolledCourse;
        }
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Fundamentals");

        Student s1 = new Student("Amena", javaCourse);
        Student s2 = new Student("Tanveer", javaCourse);

        System.out.println(s1.name+ " enrolled in: " + s1.getEnrolledCourse().title);
        System.out.println(s2.name + " enrolled in: " + s2.getEnrolledCourse().title);
    }
}

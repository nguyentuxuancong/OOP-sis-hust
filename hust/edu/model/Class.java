package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String id;
    private String room;
    private Teacher teacher;
    private Course course;
    private List<Student> students = new ArrayList<>();

    public Class(String id, String room, Teacher teacher, Course course) {
        this.id = id;
        this.room = room;
        this.teacher = teacher;
        this.course = course;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student))
            students.add(student);
    }

    public void addStudents(List<Student> students) {
        for (Student student : students) {
            addStudent(student);
        }
    }

    public void delStudent(Student student){
        if(students.contains(student))
            students.remove(student);
    }

    public void delStudents(List<Student> students){
        for(Student student : students){
            delStudent(student);
        }
    }
}

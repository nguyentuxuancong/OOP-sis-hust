package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Student extends HustPerson {
    private String major = "";
    private String program = "";
    private List<String> classes = new ArrayList<>();

    public Student(String fullname, String idnumber, String major, String program) {
        super(fullname, idnumber);
        this.major = major;
        this.program = program;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void addClassById(String classId) {
        if (!classes.contains(classId))
            classes.add(classId);
    }

    public void delClassById(String classId) {
        if (classes.contains(classId))
            classes.remove(classId);
    }

    public void classRegistration(String classId) {
        DataModel.studyRegistration(this, classId);
    }

    public void classCancellation(String classId) {
        DataModel.classCancellation(this, classId);
    }
}
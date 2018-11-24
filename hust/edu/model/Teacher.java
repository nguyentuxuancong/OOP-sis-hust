package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends HustPerson {
    private String department;
    private List<String> classes = new ArrayList<>();

    public Teacher(String fullname, String idnumber, String department) {
        super(fullname, idnumber);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void addClassById(String classId) {
        if (!classes.contains(classId))
            classes.add(classId);
    }

    public void delClassById(String classId) {
        if (classes.contains(classId))
            classes.remove(classId);
    }
}
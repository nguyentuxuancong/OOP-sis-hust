package hust.edu.model;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private static DataModel data;
    private List<Student> students = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Class> classes = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    private DataModel() {
    }

    public static DataModel getInstance() {
        if (data == null) {
            data = new DataModel();
        }
        return data;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void addClass(Class paramclass) {
        if (!classes.contains(paramclass)) {
            classes.add(paramclass);
        }
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
        }
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void delStudent(Student student) {
        if (students.contains(student))
            students.remove(student);
    }

    public void delClass(Class paramClass) {
        if (classes.contains(paramClass)) {
            classes.remove(paramClass);
            List<Student> students = paramClass.getStudents();
            Teacher teacher = paramClass.getTeacher();
            for(Student student : students)
            {
                student.delClassById(paramClass.getId());
            }
            teacher.delClassById(paramClass.getId());
        }
    }

    public void delTeacher(Teacher teacher) {
        if (teachers.contains(teacher))
            teachers.remove(teacher);
    }

    public void delCourse(Course course) {
        if (courses.contains(course))
            courses.remove(course);
    }

    public Student getStudentById(String studentId) {
        for (Student student : students)
            if (student.getIdNumber().equals(studentId))
                return student;
        return null;
    }

    public Teacher getTeacherById(String teacherId) {
        for (Teacher teacher : teachers)
            if (teacher.getIdNumber().equals(teacherId))
                return teacher;
        return null;
    }

    public Course getCourseById(String courseId) {
        for (Course course : courses)
            if (course.getId().equals(courseId))
                return course;
        return null;
    }

    public Class getClassById(String classId) {
        for (Class class1 : classes)
            if (class1.getId().equals(classId))
                return class1;
        return null;
    }

    public static void studyRegistration(Student student, String classId) {
        Class paramClass = getInstance().getClassById(classId);
        if (paramClass != null) {
            if (student.getClasses().contains(classId)) {
                System.out.println("Student " + student.getFullName() + " has already registered class " + paramClass.getCourse().getName() + " with class id " + classId + "!");
            } else {
                student.addClassById(classId);
                paramClass.addStudent(student);
                System.out.println("Student " + student.getFullName() + " has successfully registered class " + paramClass.getCourse().getName() + " with class id " + classId);
            }
        } else {
            System.out.println("Class with id " + classId + " not found!");
        }
    }
    public static void classCancellation(Student student, String classId) {
        if (student.getClasses().contains(classId)) {
            student.delClassById(classId);
            Class paramClass = getInstance().getClassById(classId);
            if (paramClass != null)
                paramClass.delStudent(student);
        }
        else{
            System.out.println("Student " + student.getFullName() + " has not already registered class " + classId + " or class does not exist!");
        }
    }

}
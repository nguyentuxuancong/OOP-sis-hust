package hust.edu.model;

public class Course {
    private String name;
    private String id;
    private int credit;

    public Course(String name, String id, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

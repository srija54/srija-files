package myfirstprogram;

public class StudentDetails {
    private int id;
    private String name;
    private boolean active;
    
    
    public StudentDetails(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    // toString method (for debugging or printing)
    @Override
    public String toString() {
   return "Student{" +"id=" + id + ", name='" + name + '\'' + ", active=" + active + '}';
    }
    public static void main(String[] args) 
    {
        StudentDetails student = new StudentDetails(11, "srija", true);
        System.out.println(student); // Print student details
        student.setId(11);
        student.setActive(false);
        System.out.println(student); // Print updated details
    }
}
package srija;

public interface Person {

	    void speak();
	}

	class Student implements Person {
	    
	    public void speak() {
	        System.out.println("kavitha mam i am present.");
	    }
	}

	class Teacher implements Person {
	    
	    public void speak() {
	        System.out.println("srija,Are u present.");
	    }
	

	
	    public static void main(String[] args) {
	       
	        Student student = new Student();
	        Teacher teacher = new Teacher();

	       
	        teacher.speak();
	        student.speak();
}
}
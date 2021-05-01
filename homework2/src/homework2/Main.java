package homework2;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("---- Student ----");
		Student student = new Student(1,"Senanur","Özçelik","email@gmail.com","snnrozclk","password","avatar.jpg");
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);	
		
		System.out.println("\n---- Student Courses ----");
		studentManager.getCourses(0);
		
		System.out.println("\n---- Instructor ----");		
		Instructor instructor = new Instructor(2,"Engin","Demiroğ","engindemirog@gmail.com","avatar.jpg","engin","demirog");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		System.out.println("\n---- Instructor Courses ----");
		instructorManager.getCourses(0);
	}

	}



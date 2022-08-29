package OOPs;

import java.util.*;

public class introduction {
	public static void main(String[] ars) {
		
		int rno[] = new int[5];
		String name[] = new String[5];
		float marks[]= new float[5];
		
//		Student[] students = new Student[5];
		
		Student kunal = new Student();
		System.out.println(kunal);
//		kunal.rno = 13;
//		kunal.marks = 98.7f;
//		kunal.name = "Kunal Kushwaha";
		System.out.println(kunal.marks);
		System.out.println(kunal.name);
		System. out.println(kunal.rno);
//		kunal.changeName("Mexan");
//		kunal.greeting();
		
		Student random = new Student(13, "Tushar", 84.64f);
		
		Student random1 = new Student(kunal);
		System.out.println(random1.name);

		Student random2 = new Student();
		System.out.println(random2.name);

		

}
}
	
	class Student{
		int rno;
		String name;
		float marks;

		public Student(int rno, String name, float marks) {
			this.rno = rno;
			this.marks = marks;
			this.name = name;
		}

		void greeting() {
			System.out.println("Hello my name is " + this.name);
		}
		void changeName(String name) {
			this.name = name;
		}
//		Student random = new Student(13, "Tushar", 84.64f);
//		here this will be replaced by  tushar
		Student (Student other){
			this.name = other.name;
			this.rno = other.rno;
			this.marks = other.marks;
			
		}
		
		Student(){
//			this (13, "New Tushar", 100.0f);
//			one word to access every object --> "this"
 			this.rno = 13;
			this.marks = 98.7f;
			this.name = "Kunal Kushwaha";
		}



	}
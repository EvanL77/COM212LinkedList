//Evan Lyons 2/28/24
//JavaB.java
//Fills array with 5 names of students and their grades. Than it prints all five names and the grades in order, prints highest grade, average grade, first student's name, and the last grade.

import java.util.Scanner; 

public class JavaB{
	
	public static void main(String[] args){
	//Intialize ints for commands: 
		int highestGrade = 0;
		int total = 0;
		
	//Intialize array: 
		Student[] ListStudents = new Student[5];
		fillArray(ListStudents);	//   <--- Calls fillArray() method
		
	//Print list of students numbered: 1. 2. 3. 4. 5. 
		for(int i = 0; i<ListStudents.length; i++)
		{
			System.out.print(i+1);
			System.out.println(". " + ListStudents[i].getName() + " - Grade: " + ListStudents[i].getGrade()+ " ");
		}
		
	//Prints the highest grade:
		for(int i = 0; i<ListStudents.length; i++)
		{
			if(ListStudents[i].getGrade()>highestGrade)
			{
				highestGrade = ListStudents[i].getGrade();
			}
		}
		System.out.println("Highest grade:" + highestGrade);
		
	//Prints the average of the grades:
		for(int i = 0; i<ListStudents.length; i++)
		{
			total = total+ListStudents[i].getGrade();
		}
		System.out.println("Average: " + total/ListStudents.length);
		
	//Get first name:
		System.out.println("First student: "+ListStudents[0].getName());
		
	//Get last grade:
		System.out.println("Last grade:" + ListStudents[4].getGrade());
		
		
	}
	
	//Fill array method: 
	public static void fillArray(Student[] ListStudents1){

		for(int i = 0; i<ListStudents1.length; i++)
		{
			System.out.println("Enter student name");
			Scanner in = new Scanner(System.in);
			String name1 = in.next();
			
			System.out.println("Enter student grade");
			int grade1 = in.nextInt();
			
			ListStudents1[i] = new Student(name1, grade1);
		}
		
	}
	
	
}

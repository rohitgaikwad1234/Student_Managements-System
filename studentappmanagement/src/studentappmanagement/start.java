package studentappmanagement;
import java.util.Scanner;

import scom.student.manage.student;
import scom.student.manage.studentdow;

public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
          
		while(true) {
			System.out.println("Press 1 for add student");
			System.out.println("Press 2 for delete student");
			System.out.println("Press 3 for update studentt");
			System.out.println("Press 4 for exit");
			
			int c=sc.nextInt();
			sc.nextLine();
			
			
			if(c==1) {
				
				System.out.println("Enter student name: ");
				String name=sc.nextLine();
				
				System.out.println("Enter student phone:");
				String phone=sc.nextLine();
				
				System.out.println("Enter student city:");
				String city=sc.nextLine();
				
				
				student st=new student(name,phone,city);
				boolean ans=studentdow.insertstutodb(st);
				
				if(ans) {
					System.out.println("Student added sucsesfully");
					
				}
				else {
					System.out.println("Something went wrong..Try again");
					
				}
				System.out.println(st);
				
				
			}
			else if(c==2) {
			
			}
			else if(c==3) {
				
			}
			else if(c==4) {
				
			}
			else {
				
			}
			
		}
	}

}

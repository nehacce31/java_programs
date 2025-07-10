import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
	    Scanner obj= new Scanner(System.in);
	    int rollno;
	    String name,branch;
	    System.out.print("Enter the Roll.no : ");
	    rollno=obj.nextInt();
	    obj.nextLine();
	    System.out.print("Enter the Student Name : ");
	    name=obj.nextLine();
	    System.out.print("Enter the Branch : ");
	    branch=obj.nextLine();
	    System.out.println("THE STUDENT DETAILS ");
        System.out.println("ROLL.NO : "+rollno);
	    System.out.println("NAME : "+name);
	    System.out.println("BRANCH : "+branch);
	}
}
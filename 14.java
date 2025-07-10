package java_project.Java;
import java.util.Scanner;
class person{
	public String Name;
	public int age;
	public void display() {
		System.out.println("name = "+Name);
		System.out.println("age = "+age);
	}
}

public class Demo {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		person obj=new person();
		String name=x.nextLine();
		int age=x.nextInt();
		obj.Name=name;
		obj.age=age;
		obj.display();
		
		
	}

}
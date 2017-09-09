import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		System.out.println("Enter employee1 Name");
		Scanner n1 = new Scanner(System.in);
		String name1 = n1.nextLine();
		System.out.println("Enter employee1 ID");
		Scanner i1 = new  Scanner(System.in);
		int id1 = i1.nextInt();
		System.out.println("Enter employee2 Name");
		Scanner n2 = new Scanner(System.in);
		String name2 = n2.nextLine();
		System.out.println("Enter employee2 ID");
		Scanner i2 = new  Scanner(System.in);
		int id2 = i2.nextInt();
		Employee ep1 = new Employee(name1, id1);
		Employee ep2 = new Employee(name2,id2);
		ep1.compareTo(ep2);
		
			
	}

}

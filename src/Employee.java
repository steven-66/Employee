import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee() {

	}

	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	@Override
	public boolean equals(Object obj) {
		Employee a = (Employee) obj;
		if (this.id==a.id){
			return true;
		}
		 return false;
	}

	public int compareTo(Employee o) {
		if (this.name.compareTo(o.name)==0) {
			System.out.println(this.equals(o));
			return 0;
		}
		else{
			System.out.println("false");
			return 1;
		}	
	}
	
	@Override
	public int compare(Employee o1, Employee o2) {

		return o1.compareTo(o2);
	}
}

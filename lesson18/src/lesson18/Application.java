package lesson18;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
	File file = new File("SecondSerialization");
	Employee emp = new Employee("Ivan", 1, 253.45);
	System.out.println(emp);
	
	Methods.serialize(emp, file);
	System.out.println(Methods.deserialize(file));
	
	File file1 = new File("ArraySerialization");
	List<Employee> listOfEmployee = new ArrayList<>();
	listOfEmployee.add(new Employee("Ivan", 1, 253.45));
	listOfEmployee.add(new Employee("Olena", 2, 453.45));
	listOfEmployee.add(new Employee("Mykola", 3, 257.83));
	System.out.println(listOfEmployee.toString());
	
	
	Methods.serialize((Serializable) listOfEmployee, file1);
	System.out.println(Methods.deserialize(file1));
	}
}

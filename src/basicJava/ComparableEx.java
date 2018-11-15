package basicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEx {

    public static void main(String[] args) {
        Employee employee1 = new Employee(3,"Bisin");
        Employee employee2 = new Employee(5,"Anil");
        Employee employee3 = new Employee(2,"Sunil");
        Employee employee4 = new Employee(1, "Joe");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        Collections.sort(employeeList);
        employeeList.stream().forEach(employee -> System.out.println(employee.getId()+" "+employee.getName()));

    }
}

package basicJava.serialization;

import java.io.*;

public class EmployeeSerializationEx {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Bisin");
        employee.setSalary(10000);

        EmployeeSerializationEx serializationEx = new EmployeeSerializationEx();
        serializationEx.serializeObject(employee);

        Employee employee1 = serializationEx.deSerialize();
        System.out.println(employee1.getName()+ " "+employee1.getSalary()+" "+employee.getPassword()+" "+employee.getSsn());
    }

    public void serializeObject(Employee employee){
        try (FileOutputStream fos = new FileOutputStream(new File("/Users/vn0hrm0/Desktop/Bisin/MyFolder/Study/Sample/employee.txt"));
             ObjectOutputStream outputStream = new ObjectOutputStream(fos);){
            outputStream.writeObject(employee);
        }catch(IOException | NumberFormatException ex){

        }
    }

    public Employee deSerialize(){
        Employee employee =null;
        try(FileInputStream fis = new FileInputStream(new File("/Users/vn0hrm0/Desktop/Bisin/MyFolder/Study/Sample/employee.txt"));
        ObjectInputStream ois = new ObjectInputStream(fis)){
            employee = (Employee) ois.readObject();

        }catch(IOException | ClassNotFoundException ex){

        }
        return employee;
    }
}

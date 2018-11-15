package basicJava.serialization;

import java.io.*;

public class EmployeeExternalizationEx {

    public static void main(String[] args) {

        EmployeeExternalizationEx externalizationEx = new EmployeeExternalizationEx();
        externalizationEx.writeObject();
        externalizationEx.readObject();

    }

    public void writeObject(){
        try (FileOutputStream fos = new FileOutputStream(new File("/Users/vn0hrm0/Desktop/Bisin/MyFolder/Study/Sample/employee.txt"));
             ObjectOutputStream outputStream = new ObjectOutputStream(fos);){
            Employee1 employee1 = new Employee1();
            employee1.writeExternal(outputStream);
        }catch (IOException ex){

        }
    }

    public void readObject(){
        Employee1 employee1 = new Employee1();
        try(FileInputStream fis = new FileInputStream(new File("/Users/vn0hrm0/Desktop/Bisin/MyFolder/Study/Sample/employee.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis)){
            employee1.readExternal(ois);
            System.out.println(employee1.getName()+" "+employee1.getSalary()+" "+employee1.getPassword());
        }catch (IOException | ClassNotFoundException ex){

        }
    }
}

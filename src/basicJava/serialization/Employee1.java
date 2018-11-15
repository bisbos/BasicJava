package basicJava.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee1 implements Externalizable {

    String name;
    int salary;
    String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject("Bisin");
        out.writeInt(1000);
        out.writeObject("abcd");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        salary = in.readInt();
        password = (String)in.readObject();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getPassword() {
        return password;
    }
}

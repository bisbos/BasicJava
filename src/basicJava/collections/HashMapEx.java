package basicJava.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {

        Person person = new Person("Bisin",28);
        Person person1 = new Person("Anil",30);
        Person person2 = new Person("Sunil",25);

        Map<Person,Integer> personMap = new HashMap<>();
        personMap.put(person,1);
        personMap.put(person1,2);
        personMap.put(person2,3);
        personMap.put(person,1);

        for (Map.Entry<Person,Integer> me:personMap.entrySet()){
            Person person3 = me.getKey();
            System.out.println(person3.getName()+" "+person2.getAge()+" "+me.getValue());
        }
    }
}

class Person {

    String name;
    int age;

    Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

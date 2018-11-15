package java8.lambda.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class InstanceMethodwithObjRefDemo2 {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Bisin",28),
                new Person("Anil",25),
                new Person("Sunil",27)
        };

        List<Person> personList = Arrays.asList(persons);
        List<Integer> ageList = getAge(personList,Person::getAge);
        System.out.println(ageList);

    }

    public static List<Integer> getAge(List<Person> personList,Function<Person,Integer> function){
        List<Integer> ageList = new ArrayList<>();
        personList.stream().forEach(persion ->ageList.add(function.apply(persion)));
        return ageList;
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
}

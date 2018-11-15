package java8.lambda.streamStudy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {

    public static void main(String[] args) {

        Person[] persons  = {
                new Person("Bisin",30,"Male"),
                new Person("Anil",26,"Male"),
                new Person("Sunil",27,"Male")
        };

        //Sort Persons by name
        List<Person> personList = Arrays.asList(persons);
        List<Person> sortedNameList = personList.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
        sortedNameList.stream().forEach(person -> System.out.println(person.getName()+ " "+person.getAge()));

        System.out.println(" ---------------------------------------------------");
        //Filter Age =30
        List<Person> filterList = personList.stream().filter(person -> person.getAge()==30).collect(Collectors.toList());
        filterList.stream().forEach(person -> System.out.println(person.getName()+ " "+person.getAge()));

        System.out.println(" ---------------------------------------------------");
        //Calculate sum of Age
        int sum = personList.stream().mapToInt(Person::getAge).sum();
        System.out.println("Sum of Age :"+sum);

        System.out.println(" ---------------------------------------------------");
        //Calculate Average of Age
         double average = personList.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("Average of Age :"+average);

        System.out.println(" ---------------------------------------------------");
        //Sum of Age by Reduction Operation
        int ageByReduce = personList.stream().map(Person::getAge).reduce(0,(a,b)->a+b);
        System.out.println("Sum of Age by Reduce:"+sum);


    }

    public void sortByName(Person[] persons){

    }
}

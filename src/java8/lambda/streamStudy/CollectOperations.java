package java8.lambda.streamStudy;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectOperations {

    public static void main(String[] args) {

        Person[] persons  = {
                new Person("Bisin",30,"Male"),
                new Person("Anil",26,"Male"),
                new Person("Sunil",27,"Male"),
                new Person("Ann",22,"Female"),
                new Person("Cathy",32,"Female")
        };

        //Arguments of collect are Target,Accumulator and Combiner
        Set<Person> personSet = Arrays.stream(persons).collect(HashSet::new,HashSet::add,HashSet::addAll);
        personSet.stream().forEach(person -> System.out.println(person.getName()+" "+person.getAge()+" "+person.getGender()));

        List<Person> personList = Arrays.asList(persons);
        System.out.println(" ---------------------------------------------------");
        //Filter Male persons
        List<Person> malePerson = personList.stream().filter(person -> person.getGender().equalsIgnoreCase("Male")).collect(Collectors.toList());
        malePerson.stream().forEach(person -> System.out.println(person.getName()+" "+person.getAge()+" "+person.getGender()));

        System.out.println(" ---------------------------------------------------");
        //Group By Gender
        Map<String,List<Person>> genderGrouping = personList.stream().collect(Collectors.groupingBy(Person::getGender));
        System.out.println(genderGrouping);


        System.out.println(" ---------------------------------------------------");
        //Find the total age by Gender
        Map<String,Integer> genderAge = personList.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.reducing(0,Person::getAge,Integer::sum)));
        System.out.println(genderAge);

        System.out.println(" ---------------------------------------------------");
        //Find the average age of each gender
        Map<String,Double> genderAvgAge = personList.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.averagingInt(Person::getAge)));
        System.out.println(genderAvgAge);

      //  Map<String,Integer> topEmployee = personList.stream().collect(Collectors.toMap(emp->emp.getName(),emp->emp,BinaryOperator.maxBy(Comparator.comparingInt(e->e))));
    }
}

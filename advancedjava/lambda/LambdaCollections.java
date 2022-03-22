package advancedjava.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
	public Person(String n,int i) {
		this.name=n;
		this.age=i;
	}
	String name;
	int age;
}

public class LambdaCollections {
public static void main(String arg[]){

	List<Person> plist= new ArrayList<Person>();
	plist.add(new Person("12",12));
	plist.add(new Person("222",122));
	plist.add(new Person("pra",34));
	// set name to haha 
	plist.forEach(prsnObj -> prsnObj.name="haha");

	plist.forEach(prsnObj-> System.out.println(prsnObj.name));
	Stream<Person> ps=plist.stream();
	Stream<Person> pslesss100=ps.filter(x->x.age<100);
	List<Person> filtered=pslesss100.collect(Collectors.toList());
	System.out.println(filtered.size());
}




}





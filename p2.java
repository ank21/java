import java.util.*;
import java.util.stream.*;
class p2{

	public static void main(String ar[]){

    ArrayList<Integer> al=new ArrayList<>();
    al.add(1);
    al.add(4);
    al.add(7);
    List<Integer> l=al.stream().filter(Integer->Integer%2==0).collect(Collectors.toList());
    System.out.println(l);

		people p=new people("ankit",23,"male");
		List<people> pl=new ArrayList<>();
		pl.add(p);
		pl.add(new people("ankita",25,"female"));
		pl.add(new people("anubhav",21,"male"));
		pl.add(new people("raj",70,"male"));
		// for(people s:pl){
		// 	System.out.println(s.getName());
		// }
		List<String> ls=pl.stream().filter(person->person.getAge()>69).map(people::getName).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(ls);

System.out.println("-----------------");

		pl.stream().map(people::getName).collect(Collectors.toList()).forEach(System.out::println);
System.out.println("-----------------");
		pl.stream().filter(people->people.getGender()=="male").map(people::getName).forEach(System.out::println);
long s=pl.stream().filter(people->people.getGender()=="male").count();
System.out.println("-----------------");
System.out.println(s);

List<people> lpc=pl.stream().filter(per->per.getAge()<69).collect(Collectors.toList());
System.out.println(lpc.size());

System.out.println("map for creating a new object list");

List<people> newpl=pl.stream().filter(person->person.getAge()==70).map(people::new).collect(Collectors.toList());

  }
}
class people{
	String name;
	Integer age;
	String gender;
	public people(){}
	public people(String name,Integer age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
public String getName(){
	return name;
	}
	public Integer getAge(){
		return age;
		}
		public String getGender(){
			return gender;
			}

			public String toString(){
				return name+"--"+gender+"--"+age;
			}

}

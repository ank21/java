import java.util.*;
import java.util.stream.*;
class p1{

	public static void main(String ar[]){

		Map<String,List<String>> hm=new HashMap<>();
		List<String> li=new ArrayList<>();
		li.add("ankit");
		li.add("anubhav");

		List<String> lii=new ArrayList<>();
		lii.add("satapathy");
		lii.add("som");
		lii.add("shelu");

		hm.put("a",li);
		hm.put("s",lii);

		for(Map.Entry<String,List<String>> m:hm.entrySet()){

			System.out.println(m.getKey()+"-->");
			for(String s:m.getValue()){
				System.out.println(s+" ");

			}
			System.out.println();
			System.out.println(4 >> 1);
		}

		List<Integer> ai=Arrays.asList(2,3,7,9,1);
		ai.forEach(System.out::println);
		System.out.println(ai.stream().filter(e->e%2==0).
		map(e->e*2).sum());

	}
}

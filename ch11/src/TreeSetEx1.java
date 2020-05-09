import java.util.*;

public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");	set.add("alien");	set.add("bat");
		set.add("car");	set.add("Car");	set.add("disc");
		set.add("dance");	set.add("dZZZZ");	set.add("dzzzz");
		set.add("elephant");	set.add("elevator");	set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + " to " +to);
		System.out.println("result1 : "+set.subSet(from,  to));
		System.out.println("result2 : "+set.subSet(from, to + "zzz"));
		// 대문자가 섞여있는 dZZZZ가 소문자뿐인 dance보다 앞에 정렬되어 있음!
		// (대문자가 소문자보다 우선함)
	}
}

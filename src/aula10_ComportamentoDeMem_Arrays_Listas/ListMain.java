package aula10_ComportamentoDeMem_Arrays_Listas;

import java.util.*;
import java.util.stream.Collectors;

public class ListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println("list.size() -> "+list.size());
//		list.remove(3);
		for(String x : list){
			System.out.println(x);
		}
		System.out.println("---------------");
		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list){
			System.out.println(x);
		}
		System.out.println("---------------");
		System.out.println("Index of Bob: "+list.indexOf("Bob"));
		System.out.println("Index of Marco: "+list.indexOf("Marco"));
		System.out.println("---------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result){
			System.out.println(x);
		}
		System.out.println("---------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println(name);
	}

}

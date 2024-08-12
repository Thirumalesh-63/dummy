package demo4;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class dummy3 {

	
	dummy3(){
		
	}
	
	public static void main(String[] args) {
		System.out.println("n");
		  Set<Integer> strset=new HashSet<>();
	        strset.add(1);
	        strset.add(2);
	        strset.add(14);
	        strset.add(1);
	        strset.stream().filter(l->l%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(p->System.out.println(p));
	        
	}
}

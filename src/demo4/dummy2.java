package demo4;

import java.util.Arrays;
import java.util.Comparator;

public class dummy2 {

	dummy2(){
		
	}
	public static void main(String[] args) {
		System.out.print("s");
		
		 Integer a[]= {1,2,3,4,3,5,2};
			String s[]= {"hi","hello","namasthe"};
			
			Arrays.asList(a).stream().distinct().sorted(Comparator.reverseOrder()).forEach(w->System.out.println(w));
		
	}
}

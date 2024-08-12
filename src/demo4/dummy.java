package demo4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class dummy {
	public static void main(String[] args) {
		Integer[] i= {1,2,3,4};
		
		List<Integer> li=Arrays.asList(i).stream().skip(1).distinct().sorted().collect(Collectors.toList());
		   
		Arrays.asList(i).stream().collect(Collectors.toList()).forEach(w->System.out.println(w));
		int a[]= {1,2,4,39,5,6};
		int big=a[0];
		for(int k=1;k<a.length; k++) {
			if(big<a[k])
				big=a[k];
		}
		int b[]=new int[big];
		for(int k=0;k<a.length; k++) {
			b[a[k]]++;
		}
		int h=0;
		int c[]=new int[big];
		for(int k=0;k<big-1; k++) {
			if(b[k]!=0)
			{
				c[h]=b[k];
				h++;
			}
		}
		for(int k=0;k<a.length; k++) {
			System.out.print(c[k]);
		}
	}

}

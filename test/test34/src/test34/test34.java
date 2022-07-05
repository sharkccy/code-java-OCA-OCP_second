package test34;

import java.util.Scanner;
import java.util.TreeSet;

public class test34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer>A = new TreeSet<>() ;
		String s1 = sc.nextLine();
		String[] ar1 = s1.split(" ");
		int i;
		for(i = 0; i < ar1.length;i++) {			
			A.add(Integer.parseInt(ar1[i]));
		}					
			
		TreeSet B = new TreeSet<>();
		String s2 = sc.nextLine();
		String[] ar2 = s2.split(" ");		
		for(i = 0; i < ar2.length;i++) {			
			B.add(Integer.parseInt(ar2[i]));
		}
		
		TreeSet C = new TreeSet<>(A); //把A資料copy到C
		C.retainAll(B);		      //再留下與B相等的。
					      //好用，比較異同較快
		
		if(A.equals(B)) {
			System.out.println("A equals B");
		}		
		else if(C.equals(A)) {
			System.out.println("A is a proper subset of B");
		}
		else if(C.equals(B)) {
			System.out.println("B is a proper subset of A");
		}
                else if(C.isEmpty()) {
			System.out.println("A and B are disjoint");
		}
		else {
			System.out.println("I'm confused!");
		}
	}

}

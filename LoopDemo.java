package intro;

import java.util.Iterator;

public class LoopDemo {

	public static void main(String[] args) {
		//FOR LOOP
		for (int i=1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("1.For Döngüsü Bitti");

		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("2.For Döngüsü Bitti");
		
		//WHILE-LOOP(KOŞUL YANLIŞSA ASLA ÇALIŞMAZ)
		int j=1;
		while(j<10) {
			System.out.println(j);
			j++;
		}
		System.out.println("While Döngüsü Bitti");
		
		//DO-WHILE LOOP(KOŞUL YANLIŞ OLSA BİLE 1 KERE ÇALIŞIR)
		int k=1;
		do {
			System.out.println(k);
			k+=2;
		} while (k<10);
		System.out.println("Do-While Döngüsü Bitti");
	}

}

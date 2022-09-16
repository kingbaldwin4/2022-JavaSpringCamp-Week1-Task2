package intro;

public class MukemmelSayi {

	public static void main(String[] args) {
		//6 -->1x2x3
		//28 -->1x2x4x7x14
		//bölenleri(kendi hariç) toplandığında kendine eşit olmalı
		int number = 28;
		int total = 0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		if(total==number) {
			System.out.println(number + " mükemmel sayıdır");
		}
		else {
			System.out.println(number + " mükemmel sayı değildir");
		}

	}

}

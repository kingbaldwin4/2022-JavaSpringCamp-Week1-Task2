package intro;
public class SwitchDemo {

	public static void main(String[] args) {
		char grade ='B';
		switch (grade) {
		case 'A': 
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok İyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Hatalı bir harf notu girdiniz...");
		}
		

	}

}

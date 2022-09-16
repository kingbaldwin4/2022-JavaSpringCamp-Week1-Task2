package intro;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Ankara";
		sehirler[0][2] = "Rize";
		sehirler[1][0] = "Trabzon";
		sehirler[1][1] = "Giresun";
		sehirler[1][2] = "Samsun";
		sehirler[2][0] = "Ordu";
		sehirler[2][1] = "Erzincan";
		sehirler[2][2] = "Gümüşhane";
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-------------");
		}
		

	}

}

import java.util.Scanner;

public class hesapmakınesı {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("İlk sayıyı girin: ");
		double sayi1 = scanner.nextDouble();
		System.out.print("İşlemi girin (+, -, *, /): ");
		char islem = scanner.next().charAt(0);
		System.out.print("İkinci sayıyı girin: ");
		double sayi2 = scanner.nextDouble();

		double sonuc;
		switch (islem) {
			case '+':
				sonuc = sayi1 + sayi2;
				break;
			case '*':
				sonuc = sayi1 * sayi2;
				break;
			case '/':
				if (sayi2 == 0) {
					System.out.println("Hata: Sıfıra bölme yapılamaz.");
					return;
				}
				sonuc = sayi1 / sayi2;
				break;
			default:
				System.out.println("Geçersiz işlem.");
				return;
		}

		System.out.println("Sonuç: " + sonuc);
		scanner.close();
	}
}

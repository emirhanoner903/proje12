import java.util.Scanner;

public class ders {
	public static void main(String[] args) {
		 int dogruSifre = sifre;
		 int maksimumHak = 3;
		int kalanHak = maksimumHak;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Kart sistemi");

			while (kalanHak > 0) {
				System.out.print("Şifrenizi girin: ");
				String sifre = scanner.nextLine();

				if (dogruSifre.equals(sifre)) {
					System.out.println("Giriş başarılı. Kartınıza hoş geldiniz!");
					return;
				}

				kalanHak--;
				System.out.println("Şifre yanlış!");
				System.out.println("Kalan hakkınız: " + kalanHak);
			}

			System.out.println("Tüm haklarınız bitti. Kartınız kilitlendi.");
		}
	}
}

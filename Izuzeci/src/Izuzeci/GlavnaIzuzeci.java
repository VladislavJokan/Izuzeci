package Izuzeci;

public class GlavnaIzuzeci {

	public static void main(String[] args) {
		
		Metode m = new Metode();
		
		try {
			System.out.println(m.podeli(10, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*int a = 10;
		int b = 0;
		
		try {
			System.out.println(a / b);
			System.out.println("Radi!!!!!!!!!!");
		} catch (ArithmeticException e) {
			System.out.println("Ovde je deljenje sa nulom!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Izasao si iz opsega");
		} catch (Exception e) {
			System.out.println("Ovo je za sve");
		}*/
		
	}

}

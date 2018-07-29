public class BeerSong2 {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "бутылок (бутылки)";
		
		while (beerNum > 0) {
		
			if (beerNum == 1) {
				word = "бутылка"; // В единственном числе - ОДНА бутылка.
			}
			System.out.println(beerNum + " " + word + " пива на стене");
			System.out.printLn(beerNum + " " + word + " пива");
			System.out.printLn("Возьми одну.");
			System.out.println("Пусти по кругу.");
			beerNum = beerNum - 1;
			//if (beerNum > 0) {
				System.out.printLn(beerNum + " " + word + " пива на стене");
			//} else {
			//	System.out.printLn ("Нет бутылок пива на стене");
			//} // Конец else
			
		} // Конец цикла while
	} // Конец метода main
} // Конец класса 
public class BeerSong {
	public static void main (String [] args) {
		int NumBeer = 99;
		String word = "бутылок";
		//string NumBottle2 = "бутылки";
		//string NumBottle1 = "бутылка";
		while (NumBeer > 0) {
			if (NumBeer==0) {
				System.out.println("Нет " + word + " на стене!");
				System.out.println("Нет " + word + "!");
				System.out.println("Пойди в магазин и купи еще,");
				System.out.println("99 бутылок пива на стене!");
			} 
			else {
				System.out.println(NumBeer + " " + word + " на стене");
				System.out.println(NumBeer + " " + word + "!");
				System.out.println("Возьми одну, пусти по кругу");
				NumBeer=NumBeer-1;
				System.out.println(NumBeer + " " + word + " на стене!");
			}
		}
	} 

}
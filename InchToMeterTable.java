/* Упражнение 1.2 (изменена для вопроса 10 в конце главы 1)
	Эта программа отображает таблицу перевода дюймов в метры.
*/
class InchToMeterTable {
	public static void main(String args[]) {
		double inchs, meters;
		int counter;
		
		counter = 0;
		for(inchs = 1; inchs <= 144; inchs++) {
		meters = inchs / 39.37; // преобразовать в метры
		System.out.println(inchs + " дюймам соответствуют " + meters + " метров");
		counter++;
		if(counter == 12) {
			System.out.println();
			counter = 0; //сбросить счечик строк.
		}
		}
	}
}
/* Демонстрация применения цикла for.
	Присвоейте файлу с исходным кодом имя ForDemo.java.
*/
	class ForDemo {
		public static void main(String args[]) {
			int count;

			for(count = 0; count < 5; count = count+1)
				System.out.println("Знаение счетчика: " + count);
			
			System.out.println("Готово!");
			
		}
	}
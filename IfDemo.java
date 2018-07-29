/* ƒемонстраци€ применени€ оператора if.
ѕрисвойте файлу с исходным кодом им€ ifDemo.java.
*/
class IfDemo {
	public static void main(String args[]) {
		int a, b, c;
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a меньше b");
			// —ледующа€ строка никогда не может быть введена
		if(a == b) System.out.println("¬ы не должны увидеть этот текст");

		System.out.println();
		
		c = a - b; // переменна€ "c" содержит значение -1

		System.out.println("с содержит -1");
		if(c >= 0) System.out.println("с - не отрицательное число");
		if(c < 0) System.out.println("с - отрицательное число");
		
		System.out.println();

		c = b - a; // переменна€ "с" теперь содерижт значение 1

		System.out.println("с содержит 1");
		if(c >= 0) System.out.println("с - не отрицательное число");
		if(c < 0) System.out.println("с - отрицательное число");
	}
}
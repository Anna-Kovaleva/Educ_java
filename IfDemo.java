/* ������������ ���������� ��������� if.
��������� ����� � �������� ����� ��� ifDemo.java.
*/
class IfDemo {
	public static void main(String args[]) {
		int a, b, c;
		a = 2;
		b = 3;
		
		if(a < b) System.out.println("a ������ b");
			// ��������� ������ ������� �� ����� ���� �������
		if(a == b) System.out.println("�� �� ������ ������� ���� �����");

		System.out.println();
		
		c = a - b; // ���������� "c" �������� �������� -1

		System.out.println("� �������� -1");
		if(c >= 0) System.out.println("� - �� ������������� �����");
		if(c < 0) System.out.println("� - ������������� �����");
		
		System.out.println();

		c = b - a; // ���������� "�" ������ �������� �������� 1

		System.out.println("� �������� 1");
		if(c >= 0) System.out.println("� - �� ������������� �����");
		if(c < 0) System.out.println("� - ������������� �����");
	}
}
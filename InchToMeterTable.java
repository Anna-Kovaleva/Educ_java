/* ���������� 1.2 (�������� ��� ������� 10 � ����� ����� 1)
	��� ��������� ���������� ������� �������� ������ � �����.
*/
class InchToMeterTable {
	public static void main(String args[]) {
		double inchs, meters;
		int counter;
		
		counter = 0;
		for(inchs = 1; inchs <= 144; inchs++) {
		meters = inchs / 39.37; // ������������� � �����
		System.out.println(inchs + " ������ ������������� " + meters + " ������");
		counter++;
		if(counter == 12) {
			System.out.println();
			counter = 0; //�������� ������ �����.
		}
		}
	}
}
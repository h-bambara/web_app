package practice;

public class StartUp {

	/*
	 * �����I�ɂ��̑���͂��ׂ�web��ŏ������邱�ƂɂȂ�D
	 */

	public static void main(String[] args) {
		VendingMachine machine1 = new VendingMachine();

		//150�~�����D
		machine1.insert100Yen(1);
		machine1.insert50Yen(1);
		machine1.replenishDrink("���b�h�u��", 200, 5);
		machine1.replenishDrink("��", 100, 5);
		machine1.showDrink();

		System.out.println("");

		System.out.println("���ݍw���\�ȃh�����N��");
		machine1.checkDrink();

	}

}

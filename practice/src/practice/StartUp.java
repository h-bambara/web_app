package practice;

public class StartUp {

	/*
	 * �����I�ɂ��̑���͂��ׂ�web��ŏ������邱�ƂɂȂ�D
	 */

	public static void main(String[] args) {
		VendingMachine machine1 = new VendingMachine();

		//1000�~�����D
		machine1.setMoney(1000);
		//������W���[�X��\��
		machine1.checkDrink();

	}

}

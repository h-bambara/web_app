package practice;

public class Test {

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
		System.out.println("************************************************************");

		//�����̔��@�Ɋi�[����Ă�����ݕ���S���擾����
		machine1.showDrink();
		System.out.println("************************************************************");

		//�w���\�Ȉ��ݕ���\��
		System.out.println("���ݍw���\�Ȉ��ݕ����ȉ��ɕ\�����܂��D");
		machine1.checkDrink();
		System.out.println("************************************************************");

		//���z�s���̌���
		machine1.buyDrink("���b�h�u��");
		System.out.println("************************************************************");

		//�����w��
		machine1.buyDrink("��");
		System.out.println("************************************************************");

		//�����̔��@�Ɋi�[����Ă�����ݕ���S���擾����(����1�����Ă��邱�Ƃ��m�F)
		machine1.showDrink();


	}

}

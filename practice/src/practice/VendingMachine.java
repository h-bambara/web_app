package practice;

import java.util.ArrayList;

public class VendingMachine {
	private int money;
	private ArrayList<Drink> drinkList;


	/*
	 * ��O�����ɂ��Ă͉��C�\��i2019/07/27���݁j
	 */


	/*�f�t�H���g�R���X�g���N�^*/
	//������Ԃ�120�~�̃R�[����5�{�i�[���Ă���D
	public VendingMachine(){
		money = 0;
		drinkList = new ArrayList<>();
		Drink cola = new Drink("�R�[��", 120, 5);
		drinkList.add(cola);
	}

	/*
	 * ������ӂɃA�N�Z�T���\�b�h���L�q�\��
	 */


	//�������z�̊m�F
	public void showMoney() {
		System.out.println("�������ꂽ���z�� " + money + "�~ �ł��D" );
	}

	//���ނ�̕ԋp
	public void returnMoney() {
		money = 0;
	}


	//�����̓����Ɋւ��郁�\�b�h
	//�w�肵�������ȊO�œ�����Ȃ��悤�ɂ���
	//10�~��n�������(n�̓��[�U�[�����͂���l���g���\��)
	public void insert10Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 10;
		}
	}

	//50�~��n�������(n�̓��[�U�[�����͂���l���g���\��)
	public void insert50Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 50;
		}
	}

	//100�~��n�������(n�̓��[�U�[�����͂���l���g���\��)
	public void insert100Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 100;
		}
	}

	//500�~��n�������(n�̓��[�U�[�����͂���l���g���\��)
	public void insert500Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 500;
		}
	}

	//1000�~��n�������(n�̓��[�U�[�����͂���l���g���\��)
	public void insert1000Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 1000;
		}
	}

}

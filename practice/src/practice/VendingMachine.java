package practice;

import java.util.ArrayList;

public class VendingMachine {
	//�������z
	private int money;
	//���̋@�̒��Ɋi�[�����h�����N�̔z��
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

	//�Q�b�^�[
	public int getMoney() {
		return money;
	}

	public ArrayList<Drink> getDrinkList() {
		return drinkList;
	}

	//�Z�b�^�[
	public void setMoney(int money) {
		this.money = money;
	}

	public void setDrinkList(Drink drink) {
		this.drinkList.add(drink);
	}

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

	//������h�����N�̃`�F�b�N
	public void checkDrink() {
		for(int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getStock() > 0 && money >= drinkList.get(i).getValue())
			System.out.println(drinkList.get(i).getName());
		}
	}

	//���̋@�̒��ɂ���h�����N�̍݌Ɏ擾
	public void showDrink() {
		for(int i = 0; i < drinkList.size(); i++) {
			System.out.println("�h�����N��:" + drinkList.get(i).getName() +
								" �l�i:" + drinkList.get(i).getValue() + " �݌ɐ�:" + drinkList.get(i).getStock() );
		}
	}

	//�����̔��@�Ƀh�����N���[����
	public void replenishDrink(String name, int value, int stock) {
		boolean listFlag = false;
		int drinkListNum = -1;
		for(int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getName().equals(name)) {
				listFlag = true;
				drinkListNum = i;
			}
		}
		if(listFlag) {
			drinkList.get(drinkListNum).setStock(drinkList.get(drinkListNum).getStock() + stock);
			drinkList.get(drinkListNum).setValue(value);
		}
		else{
			Drink drink = new Drink(name, value, stock);
			setDrinkList(drink);
		}
	}

	//�w������
	//���O�Ō������C�݌ɁC����������΍w�����C�݌ɂƂ��������̕����炷�D
	public void buyDrink(String name) {
		int drinkListNum = -1;
		for(int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getName().equals(name)) {
				drinkListNum = i;
			}
		}
		if(drinkListNum == -1) {
			System.out.println("���̂悤�Ȉ��ݕ��͈����Ă���܂���D");
			System.out.println("�ȉ��Ɏ�舵���Ă�����ݕ���\�����܂��D");
			showDrink();
		}else {
			if(money >= drinkList.get(drinkListNum).getValue()) {
				if(drinkList.get(drinkListNum).getStock() >= 1) {
					//�w������
					System.out.println("���x���肪�Ƃ��������܂��I" + drinkList.get(drinkListNum).getName() + "�����󂯎�肭�������D");
					//�݌ɐ���1����
					drinkList.get(drinkListNum).setStock(drinkList.get(drinkListNum).getStock() - 1);
					//�w���������C���������炷
					setMoney(getMoney() - drinkList.get(drinkListNum).getValue());
					//���ނ��ԋp���邩�C���̂܂܍w���ł��邩�I�ׂ�悤�ɂ��邩�͉��C�\��
					System.out.println("�c��: " + getMoney() + "�~�ł�");
				}
				//����؂ꒆ
				else {
					System.out.println("�\���󂲂����܂���. " + drinkList.get(drinkListNum).getName() + "�͔���؂�ł��D");
					System.out.println("�ȉ��ɍw���\�Ȉ��ݕ���\�����܂��D");
					checkDrink();
				}
			}
			//����������Ȃ�
			else {
				System.out.println("������" + (drinkList.get(drinkListNum).getValue() - money) + "�~����܂���D" );
			}
		}
	}

}

package entity;

/*
 * ���݂͂��̂悤��
 */

public class Drink {

	private String name;
	private int value;
	private int stock;

	/*
	 * ��O�����ɂ��Ă͉��C�\��i2019/07/27���݁j
	 */

	//�f�t�H���g�R���X�g���N�^
	public Drink() {}

	//�W���[�X�������Ɏ��R���X�g���N�^
	public Drink(String name, int value, int stock) {
		this.name = name;
		this.value = value;
		this.stock = stock;
	}

	//�A�N�Z�T���\�b�h
	//�Q�b�^�[
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public int getStock() {
		return stock;
	}

	//�Z�b�^�[
	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//�N���X���\�b�h

}

package entity;

/*
 * 現在はこのような
 */

public class Drink {

	private String name;
	private int value;
	private int stock;

	/*
	 * 例外処理については改修予定（2019/07/27現在）
	 */

	//デフォルトコンストラクタ
	public Drink() {}

	//ジュースを引数に取るコンストラクタ
	public Drink(String name, int value, int stock) {
		this.name = name;
		this.value = value;
		this.stock = stock;
	}

	//アクセサメソッド
	//ゲッター
	public String getName() {
		return name;
	}

	public int getValue() {
		return value;
	}

	public int getStock() {
		return stock;
	}

	//セッター
	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//クラスメソッド

}

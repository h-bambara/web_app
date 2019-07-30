package practice;

import java.util.ArrayList;

public class VendingMachine {
	//投入金額
	private int money;
	//自販機の中に格納されるドリンクの配列
	private ArrayList<Drink> drinkList;


	/*
	 * 例外処理については改修予定（2019/07/27現在）
	 */


	/*デフォルトコンストラクタ*/
	//初期状態で120円のコーラを5本格納している．
	public VendingMachine(){
		money = 0;
		drinkList = new ArrayList<>();
		Drink cola = new Drink("コーラ", 120, 5);
		drinkList.add(cola);
	}

	/*
	 * ここら辺にアクセサメソッドを記述予定
	 */

	//ゲッター
	public int getMoney() {
		return money;
	}

	public ArrayList<Drink> getDrinkList() {
		return drinkList;
	}

	//セッター
	public void setMoney(int money) {
		this.money = money;
	}

	public void setDrinkList(Drink drink) {
		this.drinkList.add(drink);
	}

	//投入金額の確認
	public void showMoney() {
		System.out.println("投入された金額は " + money + "円 です．" );
	}

	//お釣りの返却
	public void returnMoney() {
		money = 0;
	}


	//お金の投入に関するメソッド
	//指定したお金以外で入れられないようにした
	//10円をn枚入れる(nはユーザーが入力する値を使う予定)
	public void insert10Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 10;
		}
	}

	//50円をn枚入れる(nはユーザーが入力する値を使う予定)
	public void insert50Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 50;
		}
	}

	//100円をn枚入れる(nはユーザーが入力する値を使う予定)
	public void insert100Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 100;
		}
	}

	//500円をn枚入れる(nはユーザーが入力する値を使う予定)
	public void insert500Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 500;
		}
	}

	//1000円をn枚入れる(nはユーザーが入力する値を使う予定)
	public void insert1000Yen(int n) {
		for(int i = 0; i < n; i++) {
			money += 1000;
		}
	}

	//買えるドリンクのチェック
	public void checkDrink() {
		for(int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getStock() > 0 && money >= drinkList.get(i).getValue())
			System.out.println(drinkList.get(i).getName());
		}
	}

	//自販機の中にあるドリンクの在庫取得
	public void showDrink() {
		for(int i = 0; i < drinkList.size(); i++) {
			System.out.println("ドリンク名:" + drinkList.get(i).getName() +
								" 値段:" + drinkList.get(i).getValue() + " 在庫数:" + drinkList.get(i).getStock() );
		}
	}

	//自動販売機にドリンクを補充する
	public void replenishDrink(String name, int value, int stock) {
		Drink drink = new Drink(name, value, stock);
		setDrinkList(drink);
	}

}

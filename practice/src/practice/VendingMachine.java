package practice;

import java.util.ArrayList;

public class VendingMachine {
	private int money;
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

}

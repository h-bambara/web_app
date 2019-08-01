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

	//購入処理
	//名前で検索し，在庫，お金があれば購入し，在庫とお金をその分減らす．
	public void buyDrink(String name) {
		int drinkListNum = -1;
		for(int i = 0; i < drinkList.size(); i++) {
			if(drinkList.get(i).getName().equals(name)) {
				drinkListNum = i;
			}
		}
		if(drinkListNum == -1) {
			System.out.println("そのような飲み物は扱っておりません．");
			System.out.println("以下に取り扱っている飲み物を表示します．");
			showDrink();
		}else {
			if(money >= drinkList.get(drinkListNum).getValue()) {
				if(drinkList.get(drinkListNum).getStock() >= 1) {
					//購入処理
					System.out.println("毎度ありがとうございます！" + drinkList.get(drinkListNum).getName() + "をお受け取りください．");
					//在庫数を1引く
					drinkList.get(drinkListNum).setStock(drinkList.get(drinkListNum).getStock() - 1);
					//購入した分，お金を減らす
					setMoney(getMoney() - drinkList.get(drinkListNum).getValue());
					//お釣りを返却するか，そのまま購入できるか選べるようにするかは改修予定
					System.out.println("残金: " + getMoney() + "円です");
				}
				//売り切れ中
				else {
					System.out.println("申し訳ございません. " + drinkList.get(drinkListNum).getName() + "は売り切れです．");
					System.out.println("以下に購入可能な飲み物を表示します．");
					checkDrink();
				}
			}
			//お金が足りない
			else {
				System.out.println("お金が" + (drinkList.get(drinkListNum).getValue() - money) + "円足りません．" );
			}
		}
	}

}

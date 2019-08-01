package practice;

public class Test {

	/*
	 * 将来的にこの操作はすべてweb上で処理することになる．
	 */

	public static void main(String[] args) {
		VendingMachine machine1 = new VendingMachine();

		//150円入れる．
		machine1.insert100Yen(1);
		machine1.insert50Yen(1);
		machine1.replenishDrink("レッドブル", 200, 5);
		machine1.replenishDrink("水", 100, 5);
		System.out.println("************************************************************");

		//自動販売機に格納されている飲み物を全件取得する
		machine1.showDrink();
		System.out.println("************************************************************");

		//購入可能な飲み物を表示
		System.out.println("現在購入可能な飲み物を以下に表示します．");
		machine1.checkDrink();
		System.out.println("************************************************************");

		//金額不足の検証
		machine1.buyDrink("レッドブル");
		System.out.println("************************************************************");

		//水を購入
		machine1.buyDrink("水");
		System.out.println("************************************************************");

		//自動販売機に格納されている飲み物を全件取得する(水が1個減っていることを確認)
		machine1.showDrink();


	}

}

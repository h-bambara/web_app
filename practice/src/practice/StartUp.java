package practice;

public class StartUp {

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
		machine1.showDrink();

		System.out.println("");

		System.out.println("現在購入可能なドリンクは");
		machine1.checkDrink();

	}

}

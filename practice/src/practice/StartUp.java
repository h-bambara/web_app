package practice;

public class StartUp {

	/*
	 * 将来的にこの操作はすべてweb上で処理することになる．
	 */

	public static void main(String[] args) {
		VendingMachine machine1 = new VendingMachine();

		//1000円入れる．
		machine1.setMoney(1000);
		//買えるジュースを表示
		machine1.checkDrink();

	}

}

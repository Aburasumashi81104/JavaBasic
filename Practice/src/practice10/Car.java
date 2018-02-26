package practice10;

import java.util.Random;

/*
 * PTra10_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class Car {

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	int serialNo;
	String color;
	int gasoline;

	public  int run() {
		this.gasoline--;;

		Random rand = new Random();
		int num = rand.nextInt(15)+1;

		if(this.gasoline<0) {
			return -1;
		}
		return num;



	}

}

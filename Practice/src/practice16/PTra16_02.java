/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean boo = new Boolean(b);
		Byte byt = new Byte(by);
		Short sho = new Short(s);
		Character cha = new Character(c);
		Integer inte = new Integer(i);
		Long lon = new Long (l);
		Float flo = new Float(f);
		Double dou = new Double(d);

	}
}

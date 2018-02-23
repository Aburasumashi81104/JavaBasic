package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */


		for(int i = 0; i < 5; i++) {

			for(int k = 4-i; k < 4; k++) {
				System.out.print("■");
			}

			for(int j = i; j < 5; j++) {
				System.out.print("□");
			}

			System.out.println();
		}

		for(int i = 0; i < 5; i++) {



			for(int j = i; j < 5; j++) {
				System.out.print("■");
			}

			for(int k = 4-i; k < 4; k++) {
				System.out.print("□");
			}

			System.out.println();

		}
	}
}

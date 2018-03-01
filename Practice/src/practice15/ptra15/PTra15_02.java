/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {

		Room room = new Java2Month();
		Java2Month java2month = (Java2Month)room;
		/*Room型にJava2Monthのインスタンスを入れている*/
		/*Java2Month型にキャスト*/

		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください
		String[] array = java2month.getCurriculum();
		// 取得したカリキュラム情報を全て出力してください
		for (String roomarray : array) {
			System.out.println(roomarray);
		}
	}
}

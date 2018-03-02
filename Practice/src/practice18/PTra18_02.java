/*
 * PTra18_02.java.add
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		String[] fileRow = new String[65536];

		int index = 0;
		ArrayList<Player> playerList = new ArrayList<>();
		/*playerインスタンスを格納したいのでPlayer型のArrayListを作る*/
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	fileRow[index] = scanner.nextLine();
            	index ++;
            	/*一行ごとにぶち込む*/
            }
			for (int i = 0; i < index; i++) {
				String[] rowArray = fileRow[i].split(",");
				/*行単位で入っているものをカンマで区切ってString配列に入れる*/
				Player player = new Player();
				/*上で宣言してしまうとインスタンスは一度きりしか作成されないので*/
				/*繰り返し文のなかでインスタンスを作成する*/
				player.setPosition(rowArray[0]);
				player.setName(rowArray[1]);
				player.setCountry(rowArray[2]);
				player.setTeam(rowArray[3]);

				playerList.add(player);
				/*上で各フィールドに値を入れたplayerインスタンス自体をArrayListに格納*/
			}
			/*for文を抜けてplayerListが完成*/

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう

        for(Player p:playerList) {
            System.out.println(p.toString());
            /*繰り返しでArrayListの中身を表示*/
        }

	}
}

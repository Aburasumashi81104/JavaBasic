/*
 * PTra18_03.java
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

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		String[] fileRow = new String[65536];

		int index = 0;
		ArrayList<Player> playerList = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	fileRow[index] = scanner.nextLine();
            	index ++;

            }
			for (int i = 0; i < index; i++) {
				String[] rowArray = fileRow[i].split(",");

				Player player = new Player();

				player.setPosition(rowArray[0]);
				player.setName(rowArray[1]);
				player.setCountry(rowArray[2]);
				player.setTeam(rowArray[3]);

				playerList.add(player);

			}


        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください
        playerList.remove(playerList.indexOf("レアル・マドリード"));

		// ★ 削除後のArrayListの中身を全件出力してください
        for(Player p:playerList) {
            System.out.println(p.toString());
            /*繰り返しでArrayListの中身を表示*/
        }

	}
}

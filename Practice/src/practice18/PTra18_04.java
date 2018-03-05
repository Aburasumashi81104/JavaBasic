/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        Collections.shuffle(playerList); //リスト内をシャッフルした。あとは値を取得して出力すれば条件は満たせる

        int GKcount = 0;
        int DFcount = 0;
        int MFcount = 0;
        int FWcount = 0;
        /*これらカウントを使用して人数を制御*/

        /*基本的には削除の時と同じやり方。カウントが規定値を満たした時に処理を抜けさせる*/
        for(ListIterator<Player> it = playerList.listIterator(playerList.size()); it.hasPrevious();) {
        	Player playerteam = it.previous();
        	if (playerteam.getPosition().equals("GK")){
        		System.out.println(playerteam);
        		GKcount++;
        		if(GKcount>=1) {
        			break;      		}
        	}
        }

        for(ListIterator<Player> it = playerList.listIterator(playerList.size()); it.hasPrevious();) {
        	Player playerteam = it.previous();
        	if (playerteam.getPosition().equals("DF")){
        		System.out.println(playerteam);
        		DFcount++;
        		if(DFcount>=4) {
        			break;      		}
        	}
        }

        for(ListIterator<Player> it = playerList.listIterator(playerList.size()); it.hasPrevious();) {
        	Player playerteam = it.previous();
        	if (playerteam.getPosition().equals("MF")){
        		System.out.println(playerteam);
        		MFcount++;
        		if(MFcount>=4) {
        			break;      		}
        	}
        }

        for(ListIterator<Player> it = playerList.listIterator(playerList.size()); it.hasPrevious();) {
        	Player playerteam = it.previous();
        	if (playerteam.getPosition().equals("FW")){
        		System.out.println(playerteam);
        		FWcount++;
        		if(FWcount>=2) {
        			break;      		}
        	}
        }

	}
}

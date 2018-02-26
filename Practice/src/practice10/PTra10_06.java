package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.color = "blue";
		car2.color = "red";
		car3.color = "black";

		car1.gasoline = 30;
		car2.gasoline = 40;
		car3.gasoline = 50;

		System.out.println("目的地までの距離を入力");
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		int distance = scanner.nextInt();

		System.out.println("car1発進します");
		int count1 = 0;
		int kyori1 = 0;

		while (true) {
			int progress = car1.run();
			count1 ++;

			if(progress == -1) {
				System.out.println("目的地に到達出来ませんでした");
				break;
			}

			kyori1 += progress;

			if(kyori1>distance) {
				System.out.println("car1は目的地まで"+count1+"時間かかりました。残りのガソリンは"+car1.gasoline+"です");
				break;

			}
		}

		System.out.println("car2発進します");
		int count2 = 0;
		int kyori2 = 0;

		while (true) {
			int progress = car2.run();
			count2 ++;

			if(progress == -1) {
				System.out.println("目的地に到達出来ませんでした");
				break;
			}

			kyori2 += progress;

			if(kyori2>distance) {
				System.out.println("car2は目的地まで"+count2+"時間かかりました。残りのガソリンは"+car2.gasoline+"です");
				break;

			}
		}

		System.out.println("car3発進します");
		int count3 = 0;
		int kyori3 = 0;

		while (true) {
			int progress = car3.run();
			count3 ++;

			if(progress == -1) {
				System.out.println("目的地に到達出来ませんでした");
				break;
			}

			kyori3 += progress;

			if(kyori3>distance) {
				System.out.println("car3は目的地まで"+count3+"時間かかりました。残りのガソリンは"+car3.gasoline+"です");
				break;

			}
		}


	}
}

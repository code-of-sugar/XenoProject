package xeno;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputNum;
		int parseInputNum;
		
		System.out.println("Xenoへようこそ。ここはXenoルーム画面です。");
		System.out.println("次に実行したい事を数字で入力してください");	
		System.out.println("[1]:対戦ルームに接続");
		System.out.println("[2]:サーバーの作成");
		System.out.println("[3]:プログラムを閉じる");
		
		//正しい値が入力されるまで再入力を強制する
		while(true) {
			try {
				inputNum = scanner.next();
				parseInputNum = Integer.parseInt(inputNum);
				
				if (parseInputNum >= 1 && parseInputNum <= 3) {
					break;
				} else {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				System.out.println("記載されている数字のみ入力が可能です。入力し直してください。");
			}
		}
		scanner.close();
		
		if (parseInputNum == 1) {
			//接続処理
			System.out.println("1が入力されました");
		} else if (parseInputNum == 2) {
			//サーバー作成処理
			System.out.println("2が入力されました");
		} else {
			System.out.println("プログラムを終了します。");
			System.exit(0);
		}
	}
}

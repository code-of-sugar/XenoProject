package xeno;

import java.util.Scanner;

import org.apache.commons.validator.routines.InetAddressValidator;

public class Main {

	public static void main(String[] args) {
		xenoControlDisp();
	}
	
	public static void xenoControlDisp() {
		int inputNum;
		
		System.out.println("Xenoへようこそ。ここはXenoルーム画面です");
		System.out.println("次に実行したい事を数字で入力してください");
		System.out.println("[1]:対戦ルームに接続");
		System.out.println("[2]:サーバーの作成");
		System.out.println("[3]:プログラムを閉じる");

		//正しい値が入力されるまで再入力を要求する
		try (Scanner scan = new Scanner(System.in)){
			while(true) { 
				inputNum = scan.nextInt();
				if (inputNum == 1) {
					inputConnectInfo();
					break;
				} else if (inputNum == 2) {
					//サーバー作成処理
					System.out.println("2が入力されました");
					break;
				} else if (inputNum == 3){
					scan.close();
					System.out.println("プログラムを終了します。");
					System.exit(0);
					break;
				} else {
					System.out.println("正しい値を入力してください。");
				} 
			}
		}catch (Exception e) {
			System.err.print(e);
		}
	}
	
	public static void inputConnectInfo() {
		String ip4AdrOrZero;
		InetAddressValidator validator = InetAddressValidator.getInstance();

		System.out.println("接続先のIPv4アドレス(メイン画面に戻りたい場合はb)を入力してください");
		//ipv4形式または0じゃなければ再入力を要求する
		try (Scanner scan = new Scanner(System.in)){
			while(true) {
				ip4AdrOrZero = scan.next();
				if(validator.isValidInet4Address(ip4AdrOrZero)) {
					//RoomConnectionクラスの呼び出し
					break;
				} else if (ip4AdrOrZero.equals("b")) { 
					xenoControlDisp();
					break;
				} else 	{
					System.out.println("正しい値を入力して下さい");
				}
			}
		} catch (Exception e) {
			System.err.print(e);
		}
	}
}

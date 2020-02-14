package server;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("サーバーの起動を開始します");
		ServerSocket svSock = new ServerSocket(8081,4,null);
		System.out.println("サーバーの起動が完了しました。接続待機中...");
		Socket sock = svSock.accept();
		System.out.println(sock.getInetAddress() + "から接続");
		sock.getOutputStream().write("Hello World".getBytes());
		sock.getOutputStream().flush();
		sock.close();
		svSock.close();
	}

}
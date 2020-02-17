package communication;

import java.net.Socket;

public class RoomConnectCommunication {
	
	public static Socket connectProcessing(String ip4Adr) throws Exception {
		Socket socket = new Socket(ip4Adr, 8080);
		return socket;
	}
}

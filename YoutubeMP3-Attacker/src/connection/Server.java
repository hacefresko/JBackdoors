package connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private ServerSocket ss;
	private DataOutputStream dout;
	private DataInputStream din;
	
	private int _port;
	
	public Server(int port){
		_port = port;
	}

	public void connect() throws IOException {
		ss = new ServerSocket(_port);
		System.out.println("Waiting for connection...");
		Socket s = ss.accept();
		System.gc(); //Calls the garbage collector because of the previous function
		System.out.println("Connected");
		
		dout = new DataOutputStream(s.getOutputStream());   
		din = new DataInputStream(s.getInputStream());  
	}
	
	public void send(String str) throws IOException {
		dout.writeUTF(str);
		dout.flush();
		
		System.out.println(din.readUTF());
	}

	public void end() throws IOException {
		ss.close();
	}
	
	public boolean isClosed() {
		return ss.isClosed();
	}
}

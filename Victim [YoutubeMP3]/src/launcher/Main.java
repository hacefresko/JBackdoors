package launcher;

import java.io.IOException;

import connection.Controller;
import view.MainWindow;

public class Main {
	public static void main(String[] args) throws IOException {
		new MainWindow();
		Controller ctrl = new Controller("0.tcp.ngrok.io", 19663);
		//Controller ctrl = new Controller("192.168.0.159", 5123);
		ctrl.run();
	}
}
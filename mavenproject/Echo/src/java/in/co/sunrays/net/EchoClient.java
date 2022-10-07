package in.co.sunrays.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, Exception {
		
		Socket client =  new Socket("127.0.0.1", 4445);
		PrintWriter out = new PrintWriter(client.getOutputStream(),true);
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println("Echo Client Chalo ho gaya ");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String line = stdin.readLine();
		while (line != null) {
			out.println(line);
			System.out.println("Echo :" + in.readLine());
			if ("Bye".equals(line)) {
				break;
				}
			line = stdin.readLine();
			}
		
		out.close();
		in.close();
		stdin.close();
		
		
		client.close();
	}
}

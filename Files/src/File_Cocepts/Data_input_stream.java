package File_Cocepts;

import java.io.DataInputStream;
import java.io.IOException;

public class Data_input_stream 
{
	public static void main(String[] args) {
		DataInputStream dis=new DataInputStream(System.in);
		try {
			int ch;
			while((ch=(int)dis.read())!=-1)
			System.out.println(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

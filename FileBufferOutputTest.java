package virtusa.com;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileBufferOutputTest {

	public static void main(String[] args) {
		try
		{
			FileOutputStream outStream=new FileOutputStream("C:\\Users\\HP\\Desktop\\newFile.txt");
			BufferedOutputStream bufferedOutput=new BufferedOutputStream(outStream);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Employee ID and Name");
			int id=sc.nextInt();
			String name=sc.next();
			String str="Wlcome "+name+", your employee id is "+id;
			bufferedOutput.write(str.getBytes());
			bufferedOutput.close();
			outStream.close();
			sc.close();
			System.out.println("message written in file");
		}catch(Exception e)
		{
			System.out.println("got error");
		}
		
	
		

	}

}

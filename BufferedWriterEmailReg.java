package virtusa.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEmailReg {

	public static void main(String[] args) {
		try
		{
			FileWriter fileWriter=new FileWriter("C:\\Users\\HP\\Desktop\\newFile.txt");
			BufferedWriter buffereWriter=new BufferedWriter(fileWriter);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Name and email Id");
			String name=sc.next();
			String email=sc.next();
			String str="Wlcome "+name+", Thanku for registering your email id "+email;
			buffereWriter.write(str);
			buffereWriter.close();
			fileWriter.close();
			sc.close();
			System.out.println("message written in file");
		}catch(Exception e)
		{
			System.out.println("got error");
		}
		

	}

}

package virtusa.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReverseReading {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("C:\\Users\\HP\\Desktop\\data.txt");
			BufferedReader bufReader=new BufferedReader(fileReader);
			String str;
			while((str=bufReader.readLine())!=null)
			{
				String []words=str.split(" ");
				for(String a:words)
				{
					StringBuilder builder=new StringBuilder(a);
					System.out.print(builder.reverse().toString()+" ");
				}
				
			}
		}catch(Exception e)
		{
			System.out.println("got Exception");
		}

	}

}

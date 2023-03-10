package dec5;
import java.io.*;
public class ReadData {

	public static void main(String[] args) throws Throwable{
		
		FileReader fr = new FileReader("D:/sample.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str="";
		while ((str=br.readLine())!=null) {
			
			Thread.sleep(500);
			
			System.out.println(str);
			
		}
		}
}
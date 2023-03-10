package dec5;
import java.io.*;
public class ReadData1 {

	public static void main(String[] args) throws Throwable {
		
		//1.create new filewriter class	
		FileReader fr=new FileReader("D://sample1.txt");
		
		//2.create new bufferwriter class
		BufferedReader br=new BufferedReader(fr);
		
		//3.store null string variable
		String str="";
		
		//4.upto last line reading (while condition)
		while ((str=br.readLine())!=null){
			Thread.sleep(500);
			
		//5.print string	
			System.out.println(str);
			}
			
	}

}

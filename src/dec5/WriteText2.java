package dec5;
import java.io.*;
public class WriteText2 {

	public static void main(String[] args)throws Throwable {
	//1.create new file class
		File f=new File("D://sample.txt");
		
	//2.create new filewriter class	
		FileWriter fw=new FileWriter(f);
		
	//3.create new bufferwriter class	
		BufferedWriter bw=new BufferedWriter(fw);
		
	//4.write something	text
		bw.write("iam learning salesforce");
		bw.newLine();
		
		bw.write("Iam learning.net");
		bw.newLine();
		
		bw.write("Iam learning.net");
		
	//5.throw text
		bw.flush();
		
		bw.close();
		
	}
}

package dec5;
import java.io.*;
public class WriteText {

	public static void main(String[] args)throws Throwable {
	//create new file 
		File f = new File("D://sample.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("iam learning saleforce");
		bw.newLine();
		bw.write("Iam learnig .net");
		bw.newLine();
		bw.write("Iam laerning sap");
		bw.flush();
		bw.close();
		

	}

}
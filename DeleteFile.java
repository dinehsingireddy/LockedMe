package operations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DeleteFile {
	
	public static String FILE_LOCATION = "C:\\Users\\singi\\Downloads\\test\\";

	public void delete() {

		Scanner filename = new Scanner(System.in);
		String file = filename.next();

		File file1=  new File("C:\\Users\\singi\\Downloads\\test\\"+ file); 
		System.out.println("file : "+file1.getAbsolutePath());
		if (file1.delete()) { 
			System.out.println(" Your Have Successfully deleted the file " + file1.getName());
		} else {
			System.out.println("File Not Found -FNF .");

		}
	}
}
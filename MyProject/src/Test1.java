import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("E:\\1.txt");
		Scanner sc = new Scanner(f);
		System.out.println("文件的内容是：");
		while(sc.hasNextLine()) {
			System.out.println(sc.next());
		}
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("E:\\1.txt");
		Scanner sc = new Scanner(f);
		System.out.println("�ļ��������ǣ�");
		while(sc.hasNextLine()) {
			System.out.println(sc.next());
		}
	}

}

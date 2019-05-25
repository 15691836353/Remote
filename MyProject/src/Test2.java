import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class Test2 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	Map<String,String> m = System.getenv();
		/*
		 * for(String name : m.keySet()) { System.out.println(name+":"+m.get(name)); }
		 */
	Properties p = System.getProperties();
	p.store(new FileOutputStream("E:\\2.txt"), "System Properties");
	System.out.println(System.getProperty("os.name"));
}
}

import java.nio.charset.Charset;
import java.util.Objects;

public class Test5 {
public static void main(String[] args) {
	Object obj = null;
	System.out.println(Objects.isNull(obj));
	//System.out.println(Objects.requireNonNull(obj,"null"));
	String a = "ÖÐ¹ú";
	byte[] b = a.getBytes();
	for(byte c : b) {
		System.out.println(c);
	}
	String d = new String(b);
	System.out.println(d);

}
}

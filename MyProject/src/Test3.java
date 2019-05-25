
public class Test3 {
public static void main(String[] args) {
	String a = new String("1111");
	String b = new String("1111");
	String c = "1111";
	String d = "1111";
	System.out.println(a.hashCode()==b.hashCode());
	System.out.println(c.hashCode()==d.hashCode());
	System.out.println(System.identityHashCode(a)==System.identityHashCode(b));
	System.out.println(System.identityHashCode(c)==System.identityHashCode(d));
}
}

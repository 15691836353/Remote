import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Test7 {
public static void main(String[] args) throws Exception {
	File f = new File("C:\\Users\\Administrator\\Desktop\\������־.txt");
	System.out.println(f.getName());//�����ļ����������һ��·����
	System.out.println(f.getPath());//�����ļ�����Ӧ���ļ���
	System.out.println(f.getAbsolutePath());//����·��
	System.out.println(f.getParent());
	File fi = new File("C:\\Users\\Administrator\\Desktop\\������־1.txt");
	System.out.println(f.renameTo(fi));
	System.out.println(f.exists()+","+fi.exists());
	System.out.println(f.canWrite()+","+fi.canWrite());
	System.out.println(f.isFile()+","+fi.isFile());
	System.out.println(f.isDirectory()+","+fi.isDirectory());
	System.out.println(fi.isAbsolute());
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
	System.out.println(sdf.format(new Date(fi.lastModified()))); 
	System.out.println(fi.length());
	System.out.println(f.createNewFile());
	System.out.println(f.delete());
	//System.out.println(File.createTempFile("ddd", "xls"));
	System.out.println(new File("C:\\\\Users\\\\Administrator\\\\Desktop").canWrite());
	//System.out.println(File.createTempFile("111", "C:\\Users\\Administrator\\Desktop"));
	//(new File("C:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\ddd18019007755213912459xls")).deleteOnExit();
	System.out.println(new File("C:\\\\Users\\\\Administrator\\\\Desktop\\\\abc").mkdir());
	System.out.println(new File("C:\\\\\\\\Users\\\\\\\\Administrator\\\\\\\\Desktop").list() );
	

}
}



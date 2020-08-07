import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
import java.util.Properties;

public class PropertyFileReadMain {

	public static void main(String[] args) throws Exception{
		
		/*
		//classpath
		InputStream in1=
				PropertyFileReadMain.class.getResourceAsStream("setting.txt");
		//filepath
		InputStream in2=
				new FileInputStream("C:\\JAVA_PYTHON\\eclipse-workspaceEE\\property[설정파일]\\src\\setting.txt");
		
		System.out.println(in1);
		System.out.println(in2);
		
		BufferedReader br1=
				new BufferedReader(new InputStreamReader(in1));
		BufferedReader br2=
				new BufferedReader(new InputStreamReader(in2));
		
		String readLine1=br1.readLine();
		String[] data1= readLine1.split("=");
		System.out.println(data1[0]+"="+data1[1]);
		
		String readLine2=br2.readLine();
		String[] data2= readLine2.split("=");
		System.out.println(data2[0]+"="+data2[1]);
		*/

		/*
		 * classpath에 있는 setting.properties파일읽기
		 */
		InputStream pIn = PropertyFileReadMain.class.getResourceAsStream("setting.properties");
		
		Properties prop = new Properties();
		prop.load(pIn);
		
		String language = prop.getProperty("language");
		String encoding = prop.getProperty("encoding");
		String name = prop.getProperty("name");
		String password = prop.getProperty("password");
		System.out.println(language);
		System.out.println(encoding);
		System.out.println(name);
		System.out.println(password);
		
		/*
		 * classpath에있는 db.properties파일읽기
		 */
		InputStream dbIn=PropertyFileReadMain.class
		.getResourceAsStream("config/db.properties");
		
		Properties dbP=new Properties();
		dbP.load(dbIn);
		System.out.println(dbP.getProperty("driverClass"));
		System.out.println(dbP.getProperty("url"));
		System.out.println(dbP.getProperty("user"));
		System.out.println(dbP.getProperty("password"));
		
		
	}

}

import java.io.*;
public class O2Runner {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		User user=null;
		
		
		FileInputStream fileIn=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\JBC4Serialization\\UserInfo.ser");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		user=(User)in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);//before making transient pswrd printed 
										//but now null will be printed
		user.sayHello();

	}

}

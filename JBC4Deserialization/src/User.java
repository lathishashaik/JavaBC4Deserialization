import java.io.Serializable;

public class User implements Serializable{
	/*String name;
	String password;*/
	String name;
	transient String password;
	void sayHello() {
		System.out.println("Hello "+name);
	}

}

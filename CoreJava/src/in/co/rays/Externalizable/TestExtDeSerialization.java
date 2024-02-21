package in.co.rays.Externalizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class TestExtDeSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream file = new FileInputStream("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Obj.txt");

		ObjectInputStream in = new ObjectInputStream(file);

		MarkSheet m = (MarkSheet) in.readObject(); 

		System.out.println("id = " + m.id);
		System.out.println("name = " + m.name);
		System.out.println("physics = " + m.physics);
		System.out.println("chemistry = " + m.chemistry);
		System.out.println("maths = " + m.maths);
		System.out.println("total = " + m.total);

		in.close();
		file.close();

	}

}

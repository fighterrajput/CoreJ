package in.co.rays.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerializable {
	public static void main(String[] args) throws IOException {

		FileOutputStream file = new FileOutputStream("C:\\Users\\S K ENTERPRISES\\Desktop\\New folder (2)\\Obj.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		MarkSheet m = new MarkSheet();
		m.id = 10;
		m.name = "yash";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 81;
		m.total = m.physics + m.chemistry + m.maths;

		out.writeObject(m);

		out.close();
		file.close();

		System.out.println("Object Write Successfully...!!!");
		System.out.println("total = " + m.total);

	}

}

package lesson18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	public static void serialize(Serializable object, File file) throws IOException {
		OutputStream outStream = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(outStream);
		oos.writeObject(object);
		oos.close();
		outStream.close();
	}

	public static Serializable deserialize(File file) throws IOException, ClassNotFoundException {
		InputStream inStream = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(inStream);
		Serializable object = (Serializable) ois.readObject();
		ois.close();
		inStream.close();

		return object;
	}

}

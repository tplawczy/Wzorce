package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Tyre[] tyres = { new Tyre(16), new Tyre(3) };
		Engine engine = new Engine("some model");
		Car serializedCar = new Car(engine, tyres);
		{
			try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("object-graph.bin"))) {
				outputStream.writeObject(serializedCar);
			}
		}
		Car deserializedCar = null;
		{
			try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("object-graph.bin"))) {
				deserializedCar = (Car) inputStream.readObject();
				System.out.println(deserializedCar.getEngine().getName());
				System.out.println(deserializedCar.getTyre().length);
			}
		}

		System.out.println(serializedCar == deserializedCar);
		System.out.println(deserializedCar.equals(serializedCar));
		System.out.println(System.identityHashCode(serializedCar.getEngine()));
		System.out.println(System.identityHashCode(deserializedCar.getEngine()));
		
	}
}
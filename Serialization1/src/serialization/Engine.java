package serialization;

import java.io.Serializable;

public class Engine implements Serializable {
String Name;

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;}
	
	public Engine(String name) {
this.Name=name;
}

	
}

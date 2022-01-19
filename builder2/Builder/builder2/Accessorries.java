package builder2;

import java.util.List;

public class Accessorries {
	List<String> name;

	public List<String> getName() {
		return name;
	}

	public void setName(List<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "Accessories{" + name.toString() + '\'' +

				'}';
	}
}

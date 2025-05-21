import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Customer implements Externalizable {

	int id;
	String name;
	int age;
	double height;
	
	public Customer() {}
	public Customer(int id, String name, int age, double height) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(height);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = (Integer)in.readObject();
		name = (String)in.readObject();
		age = (Integer)in.readObject();
		height = (Double)in.readObject();
	}
	@Override
	public String toString() {
		return "id="+id+", name="+name+", age="+age+", height="+height;
	}

}

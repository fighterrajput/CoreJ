package in.co.rays.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class MarkSheet implements Externalizable {
	
	public int id = 0;
	public String name = null;
	public int physics = 0;
	public int chemistry = 0;
	public int maths = 0;
	public transient int total = 0;
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeInt(chemistry);
		out.writeInt(physics);
		out.writeInt(maths);
		
		
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id = in.readInt();
		name = (String) in.readObject();
		chemistry = in.readInt();
		maths = in.readInt();
		physics = in.readInt();
		
				
		
	}
	

}

class Box {
	private double width, height, depth;
	private static int count;

	Box() {
		count++;
	}

	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		count++;
	}

	Box(double val) {
		width = height = depth = val;
		count++;
	}

	Box(Box obj) {
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
		count++;
	}

	double volume() {
		return width * height * depth;
	}

	static int getCount() {
		return count;
	}

}

public class ObjectCountDemo {

	public static void main(String[] args) {
		System.out.println("No of objects created: " + Box.getCount());
		Box myBox1 = new Box();
		Box myBox2 = new Box(1, 2, 3);
		System.out.println("No of objects created: " + Box.getCount());
		Box myCube = new Box(5);
		Box myClone = new Box(myBox2);
		System.out.println("No of objects created: " + Box.getCount());

	}

}

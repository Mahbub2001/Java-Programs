
import java.util.Scanner;

class Box{
	double width, height, depth;
	Box(){

	}
	Box(double width, double height, double depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth; 
	}
	double volume() {
		return width*height*depth;
	}
}

public class ArrayObjects {

	public static void main(String[] args) {
		int i;
		double w,h,d;
		Scanner inp = new Scanner(System.in);
		
		Box arrayBox[] = new Box[3];
		for(i=0;i<3;i++) {
			arrayBox[i] = new Box();
			arrayBox[i].width = inp.nextDouble();
			arrayBox[i].height = inp.nextDouble();
			arrayBox[i].depth = inp.nextDouble();
			
			// w = inp.nextDouble();
			// h = inp.nextDouble();
			// d = inp.nextDouble();
			// arrayBox[i] = new Box(w,h,d);
		}
		for(i=0;i<3;i++)
			System.out.println("Volume of Box object "+(i+1)+": "+arrayBox[i].volume());
		
	}

}

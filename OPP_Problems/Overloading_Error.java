
public class Overloading_Error {

	static void vaTestInt(int ...v) {
		System.out.print("No of arguments: "+v.length+" Contents: ");
		for(int x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	static void vaTestBoolean(boolean ...v) {
		System.out.print("No of arguments: "+v.length+" Contents: ");
		for(boolean x:v)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTestInt(10);
		vaTestInt(1,2,3);
		
		vaTestBoolean(true);
		vaTestBoolean(false,true,false);
		
		vaTestInt();
		vaTestBoolean();
	}

}

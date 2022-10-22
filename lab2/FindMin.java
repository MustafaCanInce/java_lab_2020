public class FindMin{
	
	public static void main (String[] args){
		
		if(args.length == 3){
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
		
			System.out.println("a = " + a + ", b = " + b + ", c = " + c);
			
			int min = a < b ? a : b;
			
			min = min < c ? min : c;
			
			System.out.println("minumum = " + min);
			
			
		}
	}	
}
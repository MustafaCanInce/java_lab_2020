public class FindGrade{
	
	public static void main (String [] args){
		if(args.length == 1){
			int score = Integer.parseInt(args[0]);
			System.out.println("Score = " + score);
			
			if(score < 0 || score > 100){
				System.out.println("It is not a valid score!");
			}else if(score >= 90){
				System.out.println("Your Grade is A");
			}else if(score >= 80){
				System.out.println("Your Grade is B");
			}else if(score >= 70){
				System.out.println("Your Grade is C");
			}else if(score >= 60){
				System.out.println("Your Grade is D");
			}else if(score >= 0){
				System.out.println("Your Grade is F");
			}
		}
	}
}
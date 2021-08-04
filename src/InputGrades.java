import java.util.List;
import java.util.Scanner;

public class InputGrades {

	public static List<Integer> getGrades(List<Integer> grade, String name){
		Scanner input = new Scanner(System.in);
		int num = 0;
		
		do
			for(int i = 0; i > grade.size() - 1; i++){
				System.out.println("Enter " + name + " grade or -1 to quit");
				
				while(!input.hasNextInt()) {
					System.out.println("Please enter a number or -1 to quit");
					input.next();
				}
				num = input.nextInt();
				if (num == -1){
					System.out.println(name + " grades ");
					System.out.println(grade);
					return grade;
				}
				
				if ((num >= 0) && (num <= 100)) {
					grade.add(num);
				} else {
					System.out.println("Did not enter a number from 0 to 100");
				}
			}
			
			while(true);
	}
}

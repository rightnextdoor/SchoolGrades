
import java.util.ArrayList;
import java.util.List;


public class Grades {

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>();
		List<Integer> homework = new ArrayList<>();
		List<Integer> quiz = new ArrayList<>();
		String name;
		
		InputGrades grades = new InputGrades();
		Average ave = new Average();
		
		name = "Test";
		grades.getGrades(test, name);
		int gradeAve = ave.getAverage(test, name);
		
		name = "Homework";
		grades.getGrades(homework, name);
		int homeAve = ave.getAverage(homework, name);
		
		name = "Quiz";
		grades.getGrades(quiz, name);
		int quizAve = ave.getAverage(quiz, name);
		
		System.out.println("Grade Average ");
		int totalAve = (gradeAve + homeAve + quizAve) / 3 ;
		System.out.println(totalAve);

	}
	
	
	
	

}

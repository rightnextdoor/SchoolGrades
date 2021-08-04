import java.util.List;

public class Average {

	public static int getAverage(List<Integer> grade, String name) {
		int ave = 0;
		int size = grade.size();
		for(int i = 0; i < size; i++) {
			ave += grade.get(i);
		}
		System.out.println(name + " average ");
		ave = ave / size;
		System.out.println(ave);
		return ave;
		
	}
}

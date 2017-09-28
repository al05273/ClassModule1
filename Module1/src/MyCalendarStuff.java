import java.time.LocalDate;
import java.time.Period;

public class MyCalendarStuff {


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		LocalDate current = LocalDate.now();
		System.out.print("Today is "+ current.getDayOfWeek()+" "+current.getMonth()+" "+current.getYear());
		LocalDate startOfSemester = LocalDate.of(2017,  8,  14);
		Period p = Period.between(startOfSemester, current);
		System.out.print("Semester started" +startOfSemester.getMonths());

	}

}

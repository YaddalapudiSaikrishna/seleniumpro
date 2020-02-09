package Loggers_log;

public class DAY_ENUM_TEST 
{
	Day day;
	public static void main(String[] args) 
	{
	   Day d=Day.SUNDAY;
	   System.out.println(Day.THURSDAY);
	   new DAY_ENUM_TEST(d).DaysTest();
	}
	public DAY_ENUM_TEST(Day day)
	{
		this.day=day;
	}
	public void DaysTest()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println(" MONDAY day1 work here ");
			break;
		case TUESDAY:
			System.out.println(" TUESDAY day2 work here ");
			break;
		case WEDNESDAY:
			System.out.println(" WEDNESDAY day3 work here ");
			break;
		case THURSDAY:
			System.out.println(" THURSDAY day4 work here ");
			break;
		case FRIDAY:
			System.out.println(" FRIDAY day5 half work here ");
			break;
		case SATURDAY:
			System.out.println(" SATURDAY week off here ");
			break;
		case SUNDAY:
			System.out.println(" SUNDAY week end here ");
			break;
		}
	}
}

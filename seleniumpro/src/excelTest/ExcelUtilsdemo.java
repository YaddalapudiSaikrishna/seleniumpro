package excelTest;

public class ExcelUtilsdemo 
{

	public static void main(String[] args) 
	{
	String projectpath=System.getProperty("user.dir");
	ExcelUtils excel=new ExcelUtils(projectpath+"/excel data/students names.xlsx", "sheet1");
    excel.getrowcount();
    excel.getnumberdata(3,0);
    excel.getstringdata(1, 1);
	}

}

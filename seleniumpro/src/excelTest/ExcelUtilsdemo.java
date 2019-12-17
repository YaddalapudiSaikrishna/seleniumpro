package excelTest;

public class ExcelUtilsdemo 
{

	public static void main(String[] args) 
	{
	String projectpath=System.getProperty("user.dir");
	ExcelUtils excel=new ExcelUtils(projectpath+"/excel data/students names.xlsx", "sheet3");
    excel.getrowcount();
    excel.getnumberdata(1,0);
    excel.getstringdata(2, 1);
	}

}

package Loggers_log;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demolog4j1
{
	private	static Logger logger=LogManager.getLogger(demolog4j1.class);
	public static void main(String[] args)
	{
		System.out.println("hey welcome");
		
		logger.trace("this is trace message");
		logger.info("this is information");
		logger.error("this is error");
		logger.warn("this is warn");
		logger.fatal("this is fatal");
		
		System.out.println("test completed");


	}

}

package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportFile {
	
	public static ExtentReports Report;
	public static ExtentReports report()
	{
		String path=System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter Reporter=new ExtentSparkReporter(path);
		Reporter.config().setDocumentTitle("SPICE JET PAGE");
		Reporter.config().setReportName("AUTOMATION");
		Report=new ExtentReports();
		Report.attachReporter(Reporter);
		Report.setSystemInfo("Tester", "Mukul");
		return Report;
	}

}

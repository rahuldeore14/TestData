package utilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClasssys;

public class Screenshot extends BaseClasssys {
	
	public static void takeScreenshot() {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		
		SimpleDateFormat date = new SimpleDateFormat("ddMMyyy_HHmmss");
		String DateandTime =date.format(new Date());
		String dist=System.getProperty("user.dir")+"\\screenshot\\"+DateandTime+".png";
		
		
		try {
			FileUtils.copyFile(f, new File("dist"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

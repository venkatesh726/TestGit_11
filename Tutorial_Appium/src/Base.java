import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException    {
		// TODO Auto-generated method stub
		File f= new File("src");
		File fs= new File("ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();
		
		//Selecting the emulator 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		
		//Getting the apk file
		cap.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		//Only this one step will go to the server i.e establishing connection to server
		AndroidDriver<AndroidElement> ad= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
         return ad;
	}

}

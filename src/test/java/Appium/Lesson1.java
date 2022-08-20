package Appium;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class Lesson1 {

    @Test
    public void test () {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "AndoidEmulator");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomater2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\HP\\Desktop\\TECHPRO\\SELENIUM B44 (TUR)\\Appium\\Apps\\gestureTool.apk");




    }
}



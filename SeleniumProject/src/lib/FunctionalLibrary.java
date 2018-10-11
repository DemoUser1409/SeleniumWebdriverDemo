package lib;
import org.apache.commons.lang3.RandomStringUtils;


public class FunctionalLibrary {
	

		public String generatingRandomAlphanumericString() 
		{
			String generatedString = RandomStringUtils.randomAlphanumeric(10);
		    return generatedString;
		}
		
		public String generatingRandomNumber() 
		{
			String generatedNumber = RandomStringUtils.randomNumeric(10);
		    return generatedNumber;
		}
	
}

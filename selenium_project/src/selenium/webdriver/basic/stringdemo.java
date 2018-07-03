package selenium.webdriver.basic;

import org.testng.annotations.Test;

public class stringdemo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	@Test
	public void t(){

		String fullname="Selendfium-Grid-QTP-Grid";
		String []toolname=fullname.split("-");
		for(int i=0; i<toolname.length; i++){
			if(toolname[i].equalsIgnoreCase("selenium"))
			{
				System.out.print("test passed");
		        break;
			}
			
		}
		System.out.print("test failed");
		
	}

}

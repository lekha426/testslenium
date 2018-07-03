package abcd;

import org.testng.annotations.Test;

public class NewTest {
	
	@Beforeclass
	public void login(){
		system.print.ln("login");
	}
	@Afterclass
	public void login(){
		system.print.ln("logout");
	}
  @Test
  public void clsmethod() {
	  system.print.ln("class1");
  }
  
  
  
}

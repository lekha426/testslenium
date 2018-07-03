package abcd;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f1() {
  
  
		@Beforeclass
		public void login(){
			system.print.ln("login");
		}
		@Afterclass
		public void login(){
			system.print.ln("logout");
		}
	  @Test
	  public void clsmethod2() {
		  system.print.ln("class1");
	  }
  }
}

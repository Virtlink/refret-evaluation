test;
[p] {
[MultiUnit1B]
    package p;
  
  public class MultiUnit1B_in {
  	public void foo3(String[] args) {
  		MultiUnit1A_in	mu= MultiUnit1A_in.createMultiUnit1A_in(16);
  
  		System.out.println("Value = " + mu.get());
  	}
  }
  
}

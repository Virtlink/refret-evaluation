test;
[p] {
[B]
    package p;
  
  public class B {
  	private String fName;
  
  	public B(String name) {
  		fName= name;
  	}
		
  	public String toString() {
  		return fName;
  	}
  }
  
[StarDecorator]
    package p;
  
  class StarDecorator {
  	public String decorate(String in) {
  		return "*" + in + "*";
  	}
  }
  
[A]
    package p;
  
  public class A {
  	public static void main(String[] args) {
  		A a= new A();
  		B b= new B("Gugguseli");
  		a.print(b);
  	}
  
  	/**
  	 * Print
  	 * @param b
  	 */
  	public void print(B b) {
  		System.out.println(
  			new StarDecorator() {
  				public String decorate(String in) {
  					return "(" + super.decorate(in) + ")";
  				}
  			}.decorate(b.toString())
  		);
  	}
  }
  
}

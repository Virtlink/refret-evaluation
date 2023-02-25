test;
[p] {
[Inner]
    package p;
  public class Inner {
  
  	/** Comment */
  	private final A a;
  
  	public Inner(A a) {
  		super();
  		this.a= a;
  		System.out.println(getName());
  	}
  
  	public String getName() {
  		return this.a.getTopName() + ".Inner";
  	}
  }
[A]
    package p;
  class A {
  
  	public A() {
  		new Object(){};
  		System.out.println(new Inner(this).getName());
  	}
  
  	public String getTopName() {
  		return "Top";
  	}
  
  	static public void main(String[] argv) {
  		new A();
  	}
  }
  
}

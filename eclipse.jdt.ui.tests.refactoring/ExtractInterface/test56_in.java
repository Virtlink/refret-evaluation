test;
[p] {
[A1]
    package p;
  
  public class A1 extends A{
  	protected A f(){
  		return this;
  	}
  	void test(){
  		f().m1();
  	}
  }
[A]
    package p;
  
  public class A {
  	public void m() {}
  	public void m1() {}
  	protected A f(){
  		return this;
  	}
  	void test(){
  		f().m1();
  	}
  }
}

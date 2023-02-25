test;
[p] {
[B]
    package p;
  
  public class B {
  	B(int t, A a){
  		a.add();
  	}
  }
  
[C]
    package p;
  
  public class C {
  	A fA;
  	void f(){
  		B b= new B(2, fA);
  	}
  }
  
[A]
    package p;
  
  public class A {
  	public int amount(){ return 1;}
  	public void add(){}
  }
  
}

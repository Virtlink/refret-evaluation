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
  
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	int amount();
  
  }
[A]
    package p;
  
  public class A implements I {
  	public int amount(){ return 1;}
  	public void add(){}
  }
  
}

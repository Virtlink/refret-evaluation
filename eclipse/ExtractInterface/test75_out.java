test;
[p] {
[B]
    package p;
  
  public class B {
  	B(int t, I a){
  	}
  }
  
[C]
    package p;
  
  public class C {
  	I fA;
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

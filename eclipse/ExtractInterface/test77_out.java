test;
[p] {
[B]
    package p;
  
  public class B {
  	B(int t, I a){
  		a.amount();
  	}
  }
  
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	int amount();
  
  }
[A]
    package p;
  
  public class A {
  	class Inner implements I {
  		public int amount(){ return 1;}
  	}
  }
}

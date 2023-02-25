test;
[p] {
[B]
    package p;
  
  public class B {
  	B(int t, A.Inner a){
  		a.amount();
  	}
  }
  
[A]
    package p;
  
  public class A {
  	class Inner {
  		public int amount(){ return 1;}
  	}
  }
}

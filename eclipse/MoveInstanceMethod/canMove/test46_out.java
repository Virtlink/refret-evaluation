test;
[p] {
[B]
    package p;
  
  import java.sql.Date;
  
  class B {
  	Date sql= new Date(0);
  
  	void foo() {
  		java.util.Date util= new java.util.Date();
  	}
  }
[A]
    package p;
  
  public class A {
  }
  
}

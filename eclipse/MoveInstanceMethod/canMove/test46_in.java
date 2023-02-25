test;
[p] {
[B]
    package p;
  
  import java.sql.Date;
  
  class B {
  	Date sql= new Date(0);
  }
[A]
    package p;
  
  import java.util.Date;
  
  public class A {
      void foo(B b) {
      	Date util= new Date();
      }
  }
  
}

test;
[b] {
[B]
    package b;
  
  import a.A;
  
  public class B
  {
     I i = new I()
     {
  	  public void method()
  	  {
  		 A.method2();
  	  }
     };
  }
  
  interface I
  {
     void method();
  }
  
}
[a] {
[A]
    package a;
  
  public class A
  {
     public static void method2() //<--- refactor rename this method
     {
     }
  }
}

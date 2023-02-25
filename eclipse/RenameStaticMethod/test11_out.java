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
  		 A.fred();
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
     public static void fred() //<--- refactor rename this method
     {
     }
  }
}

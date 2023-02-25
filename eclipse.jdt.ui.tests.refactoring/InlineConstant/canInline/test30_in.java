test;
[p] {
[B]
    package p;
  
  import static q.Consts.constant;
  
  class B {
  	String fS= constant;
  	int fI= constant();
  }
  
[C]
    package p;
  
  import static q.Consts.constant;
  
  class C {
  	String fS= constant;
  }
  
[D]
    package p;
  
  import static q.Consts.constant;
  
  class D {
  	int fI= constant();
  }
  
[A]
    package p;
  
  import static q.Consts.constant;
  
  class A {
  }
  
}
[q] {
[Consts]
    //5, 32 -> 5, 40  replaceAll == true, removeDeclaration == true
  package q;
  
  public class Consts {
  	public static final String constant="";
  	public static int constant() { return -1; }
  }
}

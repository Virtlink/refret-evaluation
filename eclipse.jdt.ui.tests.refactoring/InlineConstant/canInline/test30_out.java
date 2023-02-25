test;
[p] {
[B]
    package p;
  
  import static q.Consts.constant;
  
  class B {
  	String fS= "";
  	int fI= constant();
  }
  
[C]
    package p;
  
  class C {
  	String fS= "";
  }
  
[D]
    package p;
  
  import static q.Consts.constant;
  
  class D {
  	int fI= constant();
  }
  
[A]
    package p;
  
  class A {
  }
  
}
[q] {
[Consts]
    //5, 32 -> 5, 40  replaceAll == true, removeDeclaration == true
  package q;
  
  public class Consts {
  	public static int constant() { return -1; }
  }
}

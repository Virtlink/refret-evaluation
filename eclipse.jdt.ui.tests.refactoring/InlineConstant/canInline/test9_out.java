test;
[p1] {
[C]
    package p1;
  
  public class C {	
  }
}
[p2] {
[D]
    // 8, 18 -> 8, 26  replaceAll == true, removeDeclaration == true
  package p2;
  
  class D {
  	void f() {
  		int j= 12345;	
  	}	
  }
}
[p3] {
[E]
    package p3;
  
  public class E {
  	static int e= 1 + 12345;
  }
}

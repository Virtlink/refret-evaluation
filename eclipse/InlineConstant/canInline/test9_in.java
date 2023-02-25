test;
[p1] {
[C]
    package p1;
  
  public class C {
  	public static final int CONSTANT= 12345;	
  }
}
[p2] {
[D]
    // 8, 18 -> 8, 26  replaceAll == true, removeDeclaration == true
  package p2;
  
  import p1.C;
  
  class D {
  	void f() {
  		int j= C.CONSTANT;	
  	}	
  }
}
[p3] {
[E]
    package p3;
  
  import p1.C;
  
  public class E {
  	static int e= 1 + C.CONSTANT;
  }
}

test;
[p1] {
[C]
    // 5, 29 -> 5, 37  replaceAll == true, removeDeclaration == false
  package p1;
  
  public class C {
  	public static final int CONSTANT= 12345;	
  }
}
[p2] {
[D]
    package p2;
  
  import p1.C;
  
  class D {
  	void f() {
  		int j= C.CONSTANT;	
  	}	
  }
}

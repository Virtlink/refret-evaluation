test;
[p1] {
[Declarer]
    package p1;
  
  public class Declarer {
  	public static final String CONSTANT= foo;
  
  	public static String foo= "foo_for_now";
  }
}
[p2] {
[InlineSite]
    // Here, an import is added for a type needed only after a qualification is added.
  // 7, 37 -> 7, 43  replaceAll == true, removeDeclaration == false
  package p2;
  
  class InlineSite {
  	static {
  		System.out.println(p1.Declarer.CONSTANT);	
  	}
  }
}

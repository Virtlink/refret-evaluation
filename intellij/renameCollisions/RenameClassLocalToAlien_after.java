test;
[renameCollisions] {
[RenameCollisions]
    package renameCollisions;
  
  import static java.lang.String.CASE_INSENSITIVE_ORDER;
  import static java.lang.String.valueOf;
  
  class <caret>String {
  	public static final int STATIC_FIELD = 5;
  	public static void staticMethod() {
  	}
  	int myField;
  	public void method() {
  	}
  }
  
  public class RenameCollisions {
  	private java.lang.String myDeclarationUsage;
  	public java.lang.String declarationUsage(java.lang.String s) {
  		return s + myDeclarationUsage;
  	}
  
  	public static void staticContext() {
  		CASE_INSENSITIVE_ORDER.getClass();
  		valueOf(0);
  
  		java.lang.String.CASE_INSENSITIVE_ORDER.getClass();
  		java.lang.String.valueOf(0);
  
  		int var6 = renameCollisions.String.STATIC_FIELD;
  		renameCollisions.String.staticMethod();
  
  		renameCollisions.String localClass = new renameCollisions.String();
  		localClass.myField++;
  		localClass.method();
  	}
  }
  
}

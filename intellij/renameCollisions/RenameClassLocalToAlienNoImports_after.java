test;
[RenameCollisions]
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
  		java.lang.String.CASE_INSENSITIVE_ORDER.getClass();
  		java.lang.String.valueOf(0);
  	}
  }
  

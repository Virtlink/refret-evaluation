test;
[RenameClassThisFqnToAlien]
    import static java.lang.String.CASE_INSENSITIVE_ORDER;
  import static java.lang.String.valueOf;
  
  public class String<caret> {
  	public static final int STATIC_FIELD = 5;
  	public static void staticMethod() {
  	}
  	private int myField;
  	public void method() {
  	}
  
  	public void instanceContext() {
  		CASE_INSENSITIVE_ORDER.getClass();
  		valueOf(0);
  
  		java.lang.String.CASE_INSENSITIVE_ORDER.getClass();
  		java.lang.String.valueOf(0);
  
  		int var6 = String.STATIC_FIELD;
  		String.staticMethod();
  
  		this.myField++;
  		this.method();
  	}
  
  	public static void staticContext() {
  		CASE_INSENSITIVE_ORDER.getClass();
  		valueOf(0);
  
  		java.lang.String.CASE_INSENSITIVE_ORDER.getClass();
  		java.lang.String.valueOf(0);
  
  		int var6 = String.STATIC_FIELD;
  		String.staticMethod();
  	}
  }
  

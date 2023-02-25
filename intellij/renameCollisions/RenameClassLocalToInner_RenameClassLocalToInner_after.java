test;
[renameCollisions] {
[RenameClassLocalToInner]
    package renameCollisions;
  
  class StaticInnerClass {
  	public static final int SN_STATIC_FIELD = 2;
  	public static void snStaticMethod() {
  	}
  }
  
  public class RenameCollisions {
  	public static class StaticInnerClass {
  		public static final int SN_STATIC_FIELD = 10;
  		public static void snStaticMethod() {
  		}
  	}
  
  	public void instanceContext() {
  		renameCollisions.StaticInnerClass localClass = new renameCollisions.StaticInnerClass();
  		int var1 = renameCollisions.StaticInnerClass.SN_STATIC_FIELD;
  		renameCollisions.StaticInnerClass.snStaticMethod();
  
  		StaticInnerClass staticInnerClass = new StaticInnerClass();
  		int var3 = RenameCollisions.StaticInnerClass.SN_STATIC_FIELD;
  		RenameCollisions.StaticInnerClass.snStaticMethod();
  	}
  
  	public static void staticContext() {
  		StaticInnerClass staticInnerClass = new StaticInnerClass();
  		int var2 = RenameCollisions.StaticInnerClass.SN_STATIC_FIELD;
  		RenameCollisions.StaticInnerClass.snStaticMethod();
  	}
  }
  
}

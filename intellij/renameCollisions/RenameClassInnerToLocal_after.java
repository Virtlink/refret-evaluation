test;
[renameCollisions] {
[RenameCollisions]
    package renameCollisions;
  
  class LocalClass {
  	public static final int SN_STATIC_FIELD = 2;
  	public static void snStaticMethod() {
  	}
  }
  
  public class RenameCollisions {
  	class Local<caret>Class {
  		public static final int SN_STATIC_FIELD = 14;
  		public void snMethod() {
  		}
  	}
  
  	public void instanceContext() {
  		renameCollisions.LocalClass localClass = new renameCollisions.LocalClass();
  		int var1 = renameCollisions.LocalClass.SN_STATIC_FIELD;
  		renameCollisions.LocalClass.snStaticMethod();
  
  		LocalClass innerClass = new LocalClass();
  		int var4 = LocalClass.SN_STATIC_FIELD;
  	}
  
  	public static void staticContext() {
  		LocalClass innerClass = new RenameCollisions().new LocalClass();
  		int var3 = LocalClass.SN_STATIC_FIELD;
  	}
  }
  
}

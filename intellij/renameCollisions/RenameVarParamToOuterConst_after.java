test;
[RenameCollisions]
    public class RenameCollisions {
  	public static final int STATIC_FIELD = 5;
  	public static class StaticInnerClass {
  		public void instanceContext(int STATIC_FIELD<caret>) {
  			int localVar = 0;
  			int var1 = localVar + STATIC_FIELD + RenameCollisions.STATIC_FIELD;
  		}
  	}
  }
  

test;
[RenameCollisions]
    public class RenameCollisions {
  	class InnerClass {
  		public static final int INNER_STATIC_FIELD = 13;
  		public void instanceContext(int param) {
  			int <caret>INNER_STATIC_FIELD = 0;
  			int var1 = INNER_STATIC_FIELD + param + InnerClass.INNER_STATIC_FIELD;
  		}
  	}
  }
  

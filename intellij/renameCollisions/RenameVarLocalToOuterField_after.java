test;
[RenameCollisions]
    public class RenameCollisions {
  	private int myField = 7;
  	class InnerClass {
  		public void instanceContext(int param) {
  			int myField<caret> = 0;
  			int var1 = myField + param + RenameCollisions.this.myField;
  		}
  	}
  }
  

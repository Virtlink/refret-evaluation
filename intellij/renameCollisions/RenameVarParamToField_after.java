test;
[RenameCollisions]
    public class RenameCollisions {
  	class InnerClass {
  		private int myInnerField = 15;
  		public void instanceContext(int myInnerField<caret>) {
  			int localVar = 0;
  			int var1 = localVar + myInnerField + this.myInnerField;
  		}
  	}
  }
  

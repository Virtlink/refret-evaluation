test;
[RenameCollisions]
    import java.io.File;
  
  public class RenameCollisions {
  	public static class StaticInnerClass {
  		public static void staticContext(int separatorChar<caret>) {
  			int var1 = File.separatorChar;
  		}
  	}
  }
  

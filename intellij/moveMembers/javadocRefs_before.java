test;
[Class1]
    
  public class Class1 {
      public static void foo(){
      }
  
      /**
       * @see #foo Some text {@link #foo label}
       */
      void test() {
      }
  }
[User]
    
  /**
   * @see Class1#foo Some text {@link Class1#foo label}
   */
  public class User {
  }
[Class2]
    
  public class Class2 {
  }

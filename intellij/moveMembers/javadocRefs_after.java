test;
[Class1]
    
  public class Class1 {
  
      /**
       * @see Class2#foo Some text {@link Class2#foo label}
       */
      void test() {
      }
  }
[User]
    
  /**
   * @see Class2#foo Some text {@link Class2#foo label}
   */
  public class User {
  }
[Class2]
    
  public class Class2 {
      public static void foo(){
      }
  }

test;
[Varargs]
    public class Varargs {
      public static String join(String separator, String... texts) {
          return "";
      }
  
      public void foo() {
          String s = join("", "i", "d", "e", "a");
      }
  }

test;
[Try]
    public class Try {
      public int test() {
          int result;
          try {
              result = Integer.parseInt("1");
          }
          catch (NumberFormatException ex) {
              throw ex;
          }
          int i = result;
          return i;
      }
  
  }
  

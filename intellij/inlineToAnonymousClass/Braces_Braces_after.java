test;
[Braces]
    public class Demo {
  
      static class MyParent {
          private final String value;
  
          MyParent(String value) {
              this.value = value;
          }
      }
  
      public static void main(String[] args) {
  
          String value = "something";
          final MyParent p;
          if (true) {
              final String value1 = value;
              p = new MyParent(value1);
          }
          else
              p = new MyParent("value");
      }
  }

test;
[RefLocalConstantInitializer]
    public class A {
      void test(String s1) {
          System.out.println(s1);
          System.out.println("");
      }
  
      void callTest() {
          String s = "";
          test(s);
      }
  }
  

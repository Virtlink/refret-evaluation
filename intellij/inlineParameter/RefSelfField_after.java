test;
[A]
    public class A {
      private final String myData;
  
      public A(String someData) {
          myData = someData;
      }
  
      void test() {
          System.out.println(myData);
      }
  
      void callTest() {
          test();        
      }
  
      void alsoCallTest() {
          test();
      }
  }

test;
[TestIntelliJ]
    public class TestIntelliJ
  {
  
      public synchronized void foo() {
          System.out.println("foo");
      }
  
      public static void main(String[] args) {
          TestIntelliJ test = new TestIntelliJ();
          test.foo();
          synchronized (TestIntelliJ.class) {
              System.out.println("fooStatic");
          }
      }
  }

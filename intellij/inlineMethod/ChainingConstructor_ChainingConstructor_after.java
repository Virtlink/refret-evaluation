test;
[ChainingConstructor]
    class InlineMethodTest {
      public static InlineMethodTest createInstance() {
          return new InlineMethodTest("hello world", 0);
      }
  
      protected InlineMethodTest() {
          this("hello world", 0);
      }
  
      public InlineMethodTest(String text, int i) {
      }
  }
  
  class Derived extends InlineMethodTest {
      public Derived(int i) {
          super("hello world", i);
      }
  }
  

test;
[ArrayMethodCallInitialized]
    public class A {
  
    public void testInlineRefactoring() {
        ar()[1] = 22;
    }
  
    private int[] ar() {
      return new int[0];
    }
  }

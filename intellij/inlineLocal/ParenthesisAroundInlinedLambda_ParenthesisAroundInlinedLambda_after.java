test;
[ParenthesisAroundInlinedLambda]
    class Test {
    interface Task  {
      void doit();
    }
  
    class SuperClient {
      public static void main(String[] args) {
          Runnable r = ((Task) () -> System.out.println("hello"))::doit;
      }
    }
  }

test;
[LocalVarInsideLambdaBody2]
    class Test {
    {
      Runnable x = () -> {
          System.out.println(new String("hello"));
      };
    }
  }

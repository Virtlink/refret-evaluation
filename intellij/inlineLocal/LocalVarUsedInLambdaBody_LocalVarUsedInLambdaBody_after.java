test;
[LocalVarUsedInLambdaBody]
    class Test {
    {
        Runnable x = () -> {
        System.out.println(new String("hello"));
      };
    }
  }

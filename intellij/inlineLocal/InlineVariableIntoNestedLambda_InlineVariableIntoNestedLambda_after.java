test;
[InlineVariableIntoNestedLambda]
    class Test {
    {
        Runnable r = () -> {Runnable rr = () -> System.out.println("hello");};
    }
  }

test;
[TailCallInsideLambda]
    class A {
  
      void bar(int x) {
      Runnable r = () -> {
        System.out.println("hi");
          if(Math.random() > 2) {
            System.out.println("xyz");
            return;
          }
          System.out.println("oops");
      };
    }
  }
  

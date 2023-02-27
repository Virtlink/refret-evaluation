test;
[Test]
    class A{
      static int [[@1|field]];

      static {
          doSomething();
          [[->1|field]] = 1;
      }

      static void doSomething() { }

  }


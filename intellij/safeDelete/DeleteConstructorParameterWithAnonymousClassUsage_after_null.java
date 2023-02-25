test;
[DeleteConstructorParameterWithAnonymousClassUsage]
    class X {
      public X() {
      }
  
      {
          new X() {};
      }
  }
  

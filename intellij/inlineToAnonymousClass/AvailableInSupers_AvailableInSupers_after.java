test;
[AvailableInSupers]
    class A {
    protected int i;
  }
  
  class B extends A {}
  
  class C {
    C() {
      B d = new B() {
          {
              System.out.println(i);
          }
      };
    }
  
  }

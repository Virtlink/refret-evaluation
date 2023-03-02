test;
[A]
    public class A {

      public void show(B [[@2|b]]){
          [[->1|&2|m(this)|b.m(this)]];
      }

      public void m (C c){
          System.out.println(this);
      }

  }

  class B{
      public void [[@1|m]](A a){
          System.out.println(a);
      }
  }
  class C{}

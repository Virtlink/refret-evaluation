test;
[A]
    public class A {
  
      public void show(B b){
          b.m(this);
      }
  
      public void m (C c){
          System.out.println(this);
      }
  
  }
  
  class B{
      public void m(A a){
          System.out.println(a);
      }
  }
  class C{}

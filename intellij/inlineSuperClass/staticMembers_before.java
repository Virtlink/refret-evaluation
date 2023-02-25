test;
[Super]
    class Super {
     public static final String S = "";
  
     static void foo(){
        System.out.println(S);
     }
  }
[Test]
    class Test extends Super{
    void bar() {
      System.out.println(Super.S);
      Super.foo();
    }
  }

test;
[xxx] {
[Inner]
    package xxx;
  
  public class Inner {
  }
  
[Outer]
    package xxx;
  
  public class Outer {
    {
      Inner inner = new Inner();
    }
  
  }
}

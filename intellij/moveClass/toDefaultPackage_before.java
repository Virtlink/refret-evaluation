// NOTE: We cannot do this test because we cannot select the empty package
[[#{move-class(1, "")}]]
test;
[pack1] {
[Class1]
  package pack1;
  
  public class [[@1|Class1]] {
  }
[User]
  package pack1;
  
  public class User {
    Class1 class1;
  }
}
[Class1]
  // empty package
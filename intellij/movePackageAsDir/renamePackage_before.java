test;
[src1] {
[module-info]
    module M {
    exports pack1;
    opens pack1;
  }
}
[src1.pack1] {
[S1]
    package pack1;
  
  public class S1{}
  
}

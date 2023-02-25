test;
[src1.pack5] {
[S7]
    package pack5;
  
  public class S7{}
  
[package-info]
    package pack5;
}
[src1] {
[module-info]
    module M {
      exports pack1 to java.compiler;
      exports pack3 to java.xml;
      exports pack4 to java.xml;
      exports pack1.pack2;
  
      opens pack1 to java.base;
      opens pack3 to java.compiler;
      opens pack4 to java.desktop;
      opens pack1.pack2 to java.base, java.xml;
  }
}
[src1.pack3] {
[S4]
    package pack3;
  
  public class S4{}
  
[package-info]
    package pack3;
}
[src1.pack4] {
[S5]
    package pack4;
  
  public class S5{}
  
[S6]
    package pack4;
  
  public class S6{}
  
}
[src1.pack1.pack2] {
[S3]
    package pack1.pack2;
  
  public class S3{}
  
}
[src1.pack1] {
[S2]
    package pack1;
  
  public class S2{}
  
[S1]
    package pack1;
  
  public class S1{}
  
}

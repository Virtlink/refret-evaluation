test;
[pack2] {
[Usage]
    package pack2;
  import pack1.*;
  
  public class Usage {
      int method() {
          java.util.List list = null;
          List myList = null;
      }
  }
[Usage2]
    package pack2;
  import java.util.*;
  
  public class Usage2 {
      int method() {
          List list = null;
          pack1.List myList = null;
      }
  }
}
[pack1] {
[List]
    package pack1;
  
  public class List {
  }
}

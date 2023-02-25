test;
[pack2] {
[Usage]
    package pack2;
  import java.util.List;
  import pack1.*;
  
  public class Usage {
      int method() {
          List list = null;
          MyList myList = null;
      }
  }
[Usage2]
    package pack2;
  import java.util.*;
  
  public class Usage2 {
      int method() {
          List list = null;
          pack1.MyList myList = null;
      }
  }
}
[pack1] {
[MyList]
    package pack1;
  
  public class MyList {
  }
}

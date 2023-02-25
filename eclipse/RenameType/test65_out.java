test;
[p1] {
[B]
    package p1;
  import p2.C;
  import java.util.*;
  public class B extends C {
  }
  
[NewC]
    package p1;
  public class C extends B{
  }
  
}
[p2] {
[C]
    package p2;
  public class C {
  }
  
}

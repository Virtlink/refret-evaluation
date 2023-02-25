test;
[p2] {
[S2]
    package p2;
  
  class S2 {
    S1 s1;
  }
[S1]
    package p2;
  
  class S1 {
    S2 s2;
  }
}
[p1] {
[S2]
    package p1;
  class S2 {
    S1 s1;
  }
[S1]
    package p1;
  class S1 {
    S2 s2;
  }
}

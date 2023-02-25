test;
[p] {
[B]
    package p;
  class B{
     static int f;
  }
  
[AA]
    package p;
  class AA{
     AA(){ B.f=0; };   
  }
  
}

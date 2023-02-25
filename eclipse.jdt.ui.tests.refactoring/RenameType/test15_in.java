test;
[p] {
[A]
    package p;
  class A{
     static void s(){};
  }
  class AA{
     AA(){ 
       A.s();
     };   
  }
}

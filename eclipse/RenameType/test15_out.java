test;
[p] {
[B]
    package p;
  class B{
     static void s(){};
  }
  class AA{
     AA(){ 
       B.s();
     };   
  }
}

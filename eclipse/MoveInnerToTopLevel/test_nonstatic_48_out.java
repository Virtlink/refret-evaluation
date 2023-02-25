test;
[p] {
[B]
    /** Copy right or wrong. */
  package p;
  
  // comment move to B 
  // second comment move to B    
  class B {
  
  }
  /* comment move to B */
  /* second comment move to B */
[A]
    package p;
  
  class A {
      int i;
  
  
       // comment in A
  
       // second comment in A
  
    
      /* comment in A */
      /* second comment in A */
  
  }
}

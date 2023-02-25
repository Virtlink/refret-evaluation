test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  	int X= 0; /*constant comment*/
  	int Y= 0; //constant line comment
  
  }
[A]
    package p;
  class A implements I {
  }
}

test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  interface I {
  
  }
[A]
    package p;
  class A implements I {
  	int x;
  }
  class ST{
  }
  class T extends ST{
  	A[] cs;
  	void add(A c){
  		((3 > 4) ? cs: cs)[0]= c;
  		cs[0].x= 0;
  	}
  }
}

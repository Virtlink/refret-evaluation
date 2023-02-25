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
  	static A[] scs;
  	void add(A c){
  		p.T.scs[0]= c;
  		p.T.scs[0].x= 0;
  	}
  }
}

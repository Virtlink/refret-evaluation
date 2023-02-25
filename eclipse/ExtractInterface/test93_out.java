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
  	A[] supercs;
  }
  class T extends ST{
  	void add(A c){
  		super.supercs[0]= c;
  		super.supercs[0].x= 0;
  	}
  }
}

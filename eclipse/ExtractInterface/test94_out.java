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
  	 A[] gm() {
  		return null;
  	}
  }
  class T extends ST{
  	void add(A c){
  		super.gm()[0]= c;
  		super.gm()[0].x= 0;
  	}
  }
}

test;
[Client]
    class Client
  {
  
      interface L { void m (); }
  
      class V implements L { 
  	void m () { }
  	void q () { }
      }
  
      //------------------------------------
  
      class C  {
  	L method() { V res = new V ();  res.q(); return res; }
      }
    
      interface I { L method(); }
  
      class D extends C implements I { }
  }
  

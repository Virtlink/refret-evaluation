test;
[p] {
[I]
    package p;
  
  /** typecomment template*/
  public interface I {
  
  	void x();
  
  	//	 TestRunListener implementation
  	void y() /* nasty */;
  
  	void z() // xx
  	;
  
  	/** Javadoc*/
  	void a() /**post-Javadoc*/
  	;
  
  	/**JD*/
  
  	//abstract
  
  	void b();
  
  	//destruct
  	void c()
  	/* Comments*/
  	/** en */
  	// gros!
  	; //post
  
  	void d();
  
  }
[A]
    package p;
  
  public abstract class A implements I {
  	public abstract void x()   ;
  	//	 TestRunListener implementation
  	public abstract void y() /* nasty */;
  	public abstract void z() // xx
  	;
  
  	/** Javadoc*/abstract public void a () /**post-Javadoc*/;
  
  	/**JD*/
  
  	//abstract
  
  	public abstract void b();
  
  	//destruct
  	public
  	abstract
  	void c
  	()
  	/* Comments*/
  	/** en */
  	// gros!
  	; //post
  	public abstract void d();
  }
  
}

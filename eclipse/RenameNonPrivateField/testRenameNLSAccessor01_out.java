test;
[p] {
[A]
    package p;
  import org.eclipse.osgi.util.NLS;
  public class A extends NLS {
  	private static final String BUNDLE_NAME = "p.messages"; //$NON-NLS-1$
  	public static String g;
  	static {
  		NLS.initializeMessages(BUNDLE_NAME, A.class);
  	}
  	private A() {}
  }
}
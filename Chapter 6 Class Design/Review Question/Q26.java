abstract class Whale {

	public abstract void dive ( ) ;
	public static void main ( String [] args  ) {
	
		Whale whale = new Q26( ) ;
		Whale.dive (3  );
	
	}
}

class Q26 extends Whale {

	static public int MAX = 3;
	public void dive( ) {
	
		System.out.println ( "Orca diving " );
	
	}
	
	public void dive ( int ...  depth ) {
	
		System.out.println ( "Orca diving deeper " + MAX );
	
	}


}
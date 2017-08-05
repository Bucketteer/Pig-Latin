import java.util.*;
import java.io.*;

class PigLatin {
	
	public static void main( String args[] ) {
		Scanner scanner = new Scanner( System.in );
		System.out.print( "Input string : " );
		String input = scanner.nextLine();
		System.out.println();
		walk( input );
	}

	static void walk( String str ) {
		String[] arr = str.split(" ");
		System.out.println( "Array len: " + arr.length );
		
		for ( int c=0; c<arr.length; c++ ) {
			System.out.println( "arr[" + c + "]: " + arr[c] );
		}

		System.out.println();
		convert( arr );	
	}

	static void convert( String arr[] ) {
		for ( int i=0; i<arr.length; i++ ) {
			char firstLetter = arr[i].charAt(0);
			char lastLetter = arr[i].charAt(arr[i].length()-1);

			if ( firstLetter == 'A' || firstLetter == 'E' || firstLetter == 'I' || firstLetter == 'O' || firstLetter == 'U' 
				|| firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u' ) {
				if ( lastLetter == ',' || lastLetter == '.' || lastLetter == '!' || lastLetter == '?' ) 
					System.out.print(arr[i].substring(0,arr[i].length()-1) + "way" + lastLetter + " ");
				else System.out.print( arr[i] + "way" + " " );
			}

			else {
				if ( lastLetter == ',' || lastLetter == '.' || lastLetter == '!' || lastLetter == '?' ) 
					System.out.print(arr[i].substring(1,arr[i].length()-1) + firstLetter + "ay" + lastLetter + " ");
				else System.out.print( arr[i].substring(1) + firstLetter + "ay" + " " );
			}
		}
		System.out.println();
	}
}


public class ClassExercise2_4 {

	public static void main(String[] arg ){
	
	
		String example = "example";
		String comparison = "comparison";
		String problem = "problem";
		String  example2 = "example2" ;
	
		char CharacterAtIndex = example.charAt(2); // 2 is the position in the string starting with 0. Should display "a".
	
		int CompareTo = example.compareTo("comparison"); // Determines if the example string comes before or after denoted by negative if it comes first, positive if

							// it comes after, or zero if they are equal. The comparison string orders it in alphebetical order, with 

							// uppercase coming before lowercase. 
	
		String Concatenate = example.concat(" problem"); // Adds problem string onto the end of example string. 

		boolean Equals = example.equals("problem"); // Outputs false. We know this one pretty well.

		boolean EqualsIgnoreCase = example.equalsIgnoreCase("problem"); // Determines if equal disregarding case.

		int IndexOf = example.indexOf("mp"); // Returns the index of the first occurance of the substring or -1 if not found. Should return index 3.

		int LastIndexOf = example.lastIndexOf("e"); // Returns the index of the last occurnance of the substring or -1 if the substring is not found.

		String ToLowerCase = example.toLowerCase(); // Converts all upcase to lowercase.

		String ToUpperCase = example.toUpperCase(); // Converts all lower to uppercase.

		String Replace = example.replace('e','a'); // Replaces all instances of the first charcter with the second character. Returns "axampla".

		String SubstringStart = example.substring(1); // Returns a string starting at entered index. Returns "xample".

		String SubstringStartEnd = example.substring(1,3); // Returns a string starting at the start index and up to , but not including the end index.
	
		String Trim = example2.trim(); // Returns a string with starting and ending whitespace removed.
		
		System.out.println(CharacterAtIndex);
		System.out.println(CompareTo);
		System.out.println(Concatenate);
		System.out.println(Equals);
		System.out.println(EqualsIgnoreCase);
		System.out.println(IndexOf);
		System.out.println(LastIndexOf);
		System.out.println(ToLowerCase);
		System.out.println(ToUpperCase);
		System.out.println(Replace);
		System.out.println(SubstringStart);
		System.out.println(SubstringStartEnd);
		System.out.println(Trim);
		
		
	}
}

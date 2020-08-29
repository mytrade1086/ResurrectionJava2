package mainjava2;

public class StringConstructor2 {

	
	public static void main(String[] args) {
		
//		String(StringBuffer s_buffer) – Allocates a new string from the string in s_buffer
//		Example:

		StringBuffer s_buffer = new StringBuffer("Geekshj");
		String stra = new String(s_buffer);
		
//		String(StringBuilder s_builder) – Allocates a new string from the string in s_builder
//		Example:
		StringBuilder s_builder = new StringBuilder("Geeks");
		String s = new String(s_builder); //Geeks
		
	}
}

package mainjava2;

public class FinallyAfterReturn {

//	Yes, finally will be called after the execution of the try or catch code blocks.
//	The only times finally won't be called are:
//	If you invoke System.exit()
//	If you invoke Runtime.getRuntime().halt(exitStatus)
//	If the JVM crashes first
//	If the JVM reaches an infinite loop (or some other non-interruptable, non-terminating statement) in the try or catch block
//	If the OS forcibly terminates the JVM process; e.g., kill -9 <pid> on UNIX
//	If the host system dies; e.g., power failure, hardware error, OS panic, et cetera
//	If the finally block is going to be executed by a daemon thread and all other non-daemon threads exit before finally is called
	
	public static void main(String[] args) {

		one();
	}

	public static int one() {	
	try {
		return 1;
		//System.out.println("line after return in try"); unreachable code error
	} catch (Exception e) {
		
		e.printStackTrace();
		return 1;
	}	
	
	finally {
		System.out.println("finally after return");
	}
	
	}
}

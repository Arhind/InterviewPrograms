/*	Q. Can we make main method as private in Java?
 * 	Ans. Yes, we can declare the main method as private in Java. It compiles successfully without any errors but at the runtime, 
 * 	   it says that the main method is not public.
 * 
 */
 class PrivateMain {

	private static void main(String[] args) {

		System.out.println("Private Method");
	}

}

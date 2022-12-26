/*	Use of most asked keywords
 * 	1. super.a
 *  2. this.a
 *  3. a
 */

package interviewquestions;

class Parent{
	
	int a = 10;
}

class VariableScope extends Parent{
	
	int a=20;
	
	void show(int a)
	{
		System.out.println("Local variable : "+a);							// Local scope of var a
		System.out.println("Accessing Child variable : "+this.a);			// Instance scope of var a
		System.out.println("Accessing Parent variable : "+super.a);			// Global scope of var a
	}
	
	public static void main(String[] args) {
		
		VariableScope ref = new VariableScope();
		ref.show(30);
	}
}
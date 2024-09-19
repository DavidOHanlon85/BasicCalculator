/**
 * 
 */
package labExercises;

/**
 * This class represents the operations of a basic calculator.
 */
public class Exercise03_Calculator {
	
	
	// Instance vars
	
	private int memory;
	
	// Getters and Setters

	/**
	 * Returns the value from memory
	 * 
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * Sets the value in memory
	 * 
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	// Methods
	
	
	/**
	 * This method adds two integers and returns the sum
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	
	
	/**
	 * This method subtracts two integers and returns the answer
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	/**
	 * This method multiplies two integers and returns the answer
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	/**
	 * This method divides two integers and returns the answer
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int divide (int num1, int num2) {
		return num1 / num2;
	}
	
	/**
	 * This method returns the square root of the input number
	 * @param num1
	 * @return
	 */
	public double sqrRoot(int num1) {
		return Math.sqrt(num1);
	}
	
	/**
	 * This method will reset memory to 0
	 */
	public void clearMemory() {
		this.memory = 0;
	}

}

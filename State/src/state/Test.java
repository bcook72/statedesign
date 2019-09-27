package state;

/* going to test the state application */

public class Test {
	
	public static void main(String[] args) {
		JellyBeanMachine jellyBeanMachine = 
			new JellyBeanMachine(50);

		System.out.println(jellyBeanMachine);

		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();
		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();

		System.out.println(jellyBeanMachine);

		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();
		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();

		System.out.println(jellyBeanMachine);

		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();
		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();

		System.out.println(jellyBeanMachine);

		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();
		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();

		System.out.println(jellyBeanMachine);

		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();
		jellyBeanMachine.insertQuarter();
		jellyBeanMachine.turnCrank();

		System.out.println(jellyBeanMachine);
	}
}

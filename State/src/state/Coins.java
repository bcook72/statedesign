package state;

/* implements coins class */

import java.util.Random;

public class Coins implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	JellyBeanMachine jellyBeanMachine;
 
	public Coins(JellyBeanMachine jellyBeanMachine) {
		this.jellyBeanMachine = jellyBeanMachine;
	}
  
	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}
 
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		jellyBeanMachine.setState(jellyBeanMachine.getNoQuarterState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		int winner = randomWinner.nextInt(10);
		if ((winner == 0) && (jellyBeanMachine.getCount() > 1)) {
			jellyBeanMachine.setState(jellyBeanMachine.getWinnerState());
		} else {
			jellyBeanMachine.setState(jellyBeanMachine.getSoldState());
		}
	}

    public void dispense() {
        System.out.println("No jelly beans dispensed");
    }
    
    public void refill() { }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}

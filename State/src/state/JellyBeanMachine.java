package state;

/* This class sets up the candy machine */

public class JellyBeanMachine {
	 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
 
	State state = soldOutState;
	int count = 0;
 
	public JellyBeanMachine(int numberJellybeans) {
		soldOutState = new AllGone(this);
		noQuarterState = new QuarterLess(this);
		hasQuarterState = new Coins(this);
		soldState = new Sold(this);
		winnerState = new Winner(this);

		this.count = numberJellybeans;
 		if (numberJellybeans > 0) {
 			state = noQuarterState;
		} 
	}
 
	public void insertQuarter() {
		state.insertQuarter();
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBeans() {
		System.out.println("Jelly beans on their way");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The jelly bean machine was just refilled; it's new count is: " + this.count);
		state.refill();
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nJelly Bellys, Inc.");
		result.append("\nJava-enabled Jelly Belly Model #24");
		result.append("\nInventory: " + count + " Jelly Bean");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
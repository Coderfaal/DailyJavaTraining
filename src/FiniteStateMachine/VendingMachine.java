package FiniteStateMachine;

import javax.swing.plaf.nimbus.State;

public class VendingMachine implements VendingMachineState {


    State idelState;
    State hasMoneyState;
    State dispensingState;
    State state;
    int balance;


    @Override
    public void insertCoin(int amount) {

    }

    @Override
    public void selectItem(int index) {

    }

    @Override
    public void cancle() {

    }

    public State getIdelState() {
        return idelState;
    }

    public void setIdelState(State idelState) {
        this.idelState = idelState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getDispensingState() {
        return dispensingState;
    }

    public void setDispensingState(State dispensingState) {
        this.dispensingState = dispensingState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}

package FiniteStateMachine;

public interface VendingMachineState {
   void insertCoin (int amount);
   void selectItem (int index);
   void cancle();
}

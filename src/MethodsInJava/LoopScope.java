package MethodsInJava;

public class LoopScope {
    public static void main(String[] args) {
        for(int i =1 ; i<=5;i++){
            System.out.println("HELLO WORLD!!");
        }
        //int i cannot be accessed outside the loop
    }

}
// anything initialised outside the block can be used inside the block and cannot be reinitialised
//anything initialised inside th block cannot be used outside but can be used inside
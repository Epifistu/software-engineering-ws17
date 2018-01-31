//package src;

public class EmptyAccount extends Exception {
    public EmptyAccount(){
        super("Zero or negative money doesn't get more when converted in another currency!");
    }
}

package com.springlearning;

public class Desktop implements Computer {
    public Desktop() {
        System.out.println("Laptop Object Created");
    }

    @Override
    public void compile(){
        System.out.println("Desktop Compiling");
    }
}

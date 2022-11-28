package com.company;

public class Main {

    public static void main(String[] args) {
	    Floor firstFloor = new Floor(2.0,2.0);
        Carpet firstCost = new Carpet(1.5);
        Calculator firstCalculation = new Calculator(firstFloor,firstCost);
        System.out.println(firstCalculation.getTotalCost());
    }
}

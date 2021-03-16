package com.cognizant.adapter_pattern;

/**
 *   Structutral Pattern
 */
public class Test {

    public static void main(String[] args) {
		
    	Movable bugattiVeyron = new BugattiVeyron();
    	MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
 	
    	System.out.println(bugattiVeyronAdapter.getSpeed());
    	
	}
	
}

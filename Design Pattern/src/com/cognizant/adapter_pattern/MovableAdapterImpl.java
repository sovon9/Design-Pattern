package com.cognizant.adapter_pattern;

/**
 * adapter interface
 */
public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;
	
	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

}

package com.cognizant.solid;

// CLASS with interface implementation
public class PhoneOrderRepair implements OrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		
		System.out.println(modelName+" order accepted !");

	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		
		System.out.println(modelName+" repair accepted !");

	}

	@Override
	public void ProcessAccessoryRepair(String accessType) {
		
		System.out.println(accessType+" repair accepted !");

	}

}

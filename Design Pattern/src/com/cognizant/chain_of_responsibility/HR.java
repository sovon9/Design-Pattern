package com.cognizant.chain_of_responsibility;

public class HR implements LeaveRequestHandler{

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		
		if(leaveRequest.getLeaveDays()>5)
		{
			System.out.println(leaveRequest.getEmployee()+" leave accepted by HR");
		}
		else
		{
			System.out.println(leaveRequest.getEmployee()+" leave rejected by HR");
		}
		
	}


}

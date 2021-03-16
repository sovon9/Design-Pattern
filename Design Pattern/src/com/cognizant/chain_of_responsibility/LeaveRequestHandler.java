package com.cognizant.chain_of_responsibility;

public interface LeaveRequestHandler {

	public LeaveRequestHandler nextHandler=null;
	
	public void handleRequest(LeaveRequest leaveRequest);
	
}

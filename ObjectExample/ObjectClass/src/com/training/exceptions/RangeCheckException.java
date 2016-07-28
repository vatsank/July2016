package com.training.exceptions;

public class RangeCheckException extends Exception {

	  private long bookNumber;

	public RangeCheckException(long bookNumber) {
		super();
		this.bookNumber = bookNumber;
	}

	@Override
	public String getMessage() {
		
		return this.bookNumber +"should be 1000-10000";
	}

	@Override
	public void printStackTrace() {
		// TODO Auto-generated method stub
		super.printStackTrace();
	}
	  
	  
}

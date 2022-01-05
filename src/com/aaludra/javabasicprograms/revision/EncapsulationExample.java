package com.aaludra.javabasicprograms.revision;

public class EncapsulationExample {
	private String accholdname;
	private long accno;
	private float interest;
	public String getAccholdname() {
		return accholdname;
	}
	public void setAccholdname(String accholdname) {
		this.accholdname = accholdname;
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long l) {
		this.accno = l;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	

}

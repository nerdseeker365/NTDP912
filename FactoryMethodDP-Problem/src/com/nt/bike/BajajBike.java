package com.nt.bike;

public abstract class BajajBike {
	private  String engineCC;
	private String  engieType;
	
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setEngieType(String engieType) {
		this.engieType = engieType;
	}
	
	public abstract  void  drive();
	

}

package com.nt.product;

public class House {
	private  Basement basement;
	private  Structure structure;
	private  Roof   roof;
	private  Interior interior;
	public void setBasement(Basement basement) {
		this.basement = basement;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	public void setRoof(Roof roof) {
		this.roof = roof;
	}
	
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	
	@Override
	public String toString() {
		return "House [basement=" + basement + ", structure=" + structure + ", roof=" + roof + ", interior=" + interior
				+ "]";
	}	

}

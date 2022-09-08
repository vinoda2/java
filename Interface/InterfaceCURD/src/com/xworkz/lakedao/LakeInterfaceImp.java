package com.xworkz.lakedao;

import com.xworkz.lakedto.LakeDTO;

public class LakeInterfaceImp implements LakeInterface{
	public LakeDTO ldto[]=new LakeDTO[5];
	int index=0;
	
	@Override
	public boolean save(LakeDTO lakeDTO) {
		if(lakeDTO==null) {
			System.out.println("object is null");
		}else if(this.index<this.ldto.length) {
			this.ldto[index]=lakeDTO;
			System.out.println("object is saved:"+this.index);
			this.index++;
			return true;
		}else {
			System.out.println("array is full");
		}
		return false;
	}

	@Override
	public void main() {
		System.out.println("Im a DTO interface Method");
	}
	

}

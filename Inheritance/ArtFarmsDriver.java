package com.xworkz.Inheritance;

public class ArtFarmsDriver {

	public static void main(String[] args) {
		ArtFarms art = new ArtFarms();
		WarliArt warli = new WarliArt();
		LineArt line = new LineArt();
		art.getArtFarms();
		warli.getWarliArt();
		line.getLineArt();
		
		ArtFarms art1=new WarliArt();//possible
		ArtFarms art2=new LineArt();//possible
		WarliArt art3=new LineArt();//possible
		System.out.println(art1);
		System.out.println(art2);
		System.out.println(art3);
		//WarliArt art4=new ArtFarms();//Not possible
		WarliArt art4=(WarliArt)art1;//typecasting with objects
		if(art4 instanceof LineArt ) {
			System.out.println("yes");
		}else if(art4 instanceof ArtFarms) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	
		
		art4.artID=67;
		System.out.println(art4.artID);
		
		//class castException
		//LineArt castingobj=(LineArt)art4;
		if(art4 instanceof ArtFarms ) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}

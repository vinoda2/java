package com.java.patterns;

public class Pattern1 {
	// i represents column
	// j represents Row
	
	public void design() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
	}
	
	public void design1() {
		for(int i=0;i<5;i++) {
			System.out.print(i);
		}
		System.out.println(" ");
	}
	public void design2() {
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	public void design3() {
		for(int i=5;i>=0;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}
	public void design4() {
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("A");
			}
			System.out.println(" ");
		}
	}
	public void design5() {
		for(int i=5;i>=0;i--) {
			for(int j=i;j<5;j++) {
				System.out.print("B");
			}
			System.out.println(" ");
		}
	}
	public void design6() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("C");
				}
			System.out.println(" ");
		}
	}
	public void design7() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==0||j==2||j==4) {
					System.out.print("F");
				}else {
				System.out.print("C");
				}
			}
			System.out.println(" ");
		}
	}

	public void design8() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==1||j==3||j==5) {
					System.out.print("F");
				}else {
				System.out.print("C");
				}
			}
			System.out.println(" ");
		}
	}

	public void design9() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++) {
				if(j==0||j==2||j==4||j==6) {
					System.out.print(" ");
				}else {
				System.out.print("C");
				}
			}
			System.out.println(" ");
		}
	}
	
	
}

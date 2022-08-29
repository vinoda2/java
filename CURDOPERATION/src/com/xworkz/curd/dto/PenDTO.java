package com.xworkz.curd.dto;

public class PenDTO {
		private String color;
		private double price;
		private String brand;
		
		public PenDTO(){
			System.out.println("defualt constructor");
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		
		@Override
		public String toString() {
			return "PenDTO [color=" + color + ", price=" + price + ", brand=" + brand + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((brand == null) ? 0 : brand.hashCode());
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!(obj instanceof PenDTO))
				return false;
			PenDTO other = (PenDTO) obj;
			if (brand == null) {
				if (other.brand != null)
					return false;
			} else if (!brand.equals(other.brand))
				return false;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			return true;
		}
		
}

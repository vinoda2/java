package com.xworkz.atmcard.dto;

import java.io.Serializable;

public class AtmDTO implements Serializable {
	
	
	private int cvv;
	private String date;
	private long cardNumber;
	private int pin;
	
	public AtmDTO(int cvv, String date, long cardNumber, int pin) {
		super();
		this.cvv = cvv;
		this.date = date;
		this.cardNumber = cardNumber;
		this.pin = pin;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		result = prime * result + cvv;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + pin;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof AtmDTO)) {
			return false;
		}
		AtmDTO other = (AtmDTO) obj;
		if (cardNumber != other.cardNumber) {
			return false;
		}
		if (cvv != other.cvv) {
			return false;
		}
		if (date == null) {
			if (other.date != null) {
				return false;
			}
		} else if (!date.equals(other.date)) {
			return false;
		}
		if (pin != other.pin) {
			return false;
		}
		return true;
	}

	
	
}

package com.aurionpro.model;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, OLSAN, RYAN, PRS, ANY;

	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case COLLINGS:
			return "Collings";
		case OLSAN:
			return "Olsan";
		case RYAN:
			return "Ryan";
		case PRS:
			return "Prs";
		case ANY:
			return "Any";
		default:
			return "Unknown";
		}

	}

}

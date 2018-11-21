package es.uneatlantico.airport;

public class Route {

	private String airline;
	private int airlineID;
	private String srcAirport;
	private int srcAirportID;
	private String dstAirport;
	private int dstAirportID;
	private String codeshare;
	private int stops;
	private String equipement;
	
	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	public String getAirline() {
		return airline;
	}
	
	public void setAirlineID(int airlineID) {
		this.airlineID = airlineID;
	}
	
	public int getAirlineID() {
		return airlineID;
	}
	
	public void setSrcAirport(String srcAirport) {
		this.srcAirport = srcAirport;
	}
	
	public String getSrcAirport() {
		return srcAirport;
	}
	
	public void setSrcAirportID(int srcAirportID) {
		this.srcAirportID = srcAirportID;
	}
	
	public int getSrcAirportID() {
		return srcAirportID;
	}
	
	public void setDstAirport(String dstAirport) {
		this.dstAirport = dstAirport;
	}
	
	public String getDstAirport() {
		return dstAirport;
	}
	
	public void setDstAirportID(int dstAirportID) {
		this.dstAirportID = dstAirportID;
	}
	
	public int getDstAirportID() {
		return dstAirportID;
	}
	
	public void setCodeshare(String codeshare) {
		this.codeshare = codeshare;
	}
	
	public String getCodeshare() {
		return codeshare;
	}
	
	public void setStops(int stops) {
		this.stops = stops;
	}
	
	public int getStops() {
		return stops;
	}
	
	public void setEquipement(String equipement) {
		this.equipement = equipement;
	}
	
	public String getEquipement() {
		return equipement;
	}
	
}

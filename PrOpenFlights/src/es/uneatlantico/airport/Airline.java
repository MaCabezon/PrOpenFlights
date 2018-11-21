package es.uneatlantico.airport;

public class Airline {

	private int ID;
	private String name;
	private String alias;
	private String IATA;
	private String ICAO;
	private String callsign;
	private String country;
	private String active;
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setIATA(String iATA) {
		IATA = iATA;
	}
	
	public String getIATA() {
		return IATA;
	}
	
	public void setICAO(String iCAO) {
		ICAO = iCAO;
	}
	
	public String getICAO() {
		return ICAO;
	}
	
	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}
	
	public String getCallsign() {
		return callsign;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setActive(String active) {
		this.active = active;
	}
	
	public String getActive() {
		return active;
	}
}

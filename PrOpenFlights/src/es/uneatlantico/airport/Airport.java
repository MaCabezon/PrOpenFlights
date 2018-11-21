package es.uneatlantico.airport;

public class Airport {

	private int ID;
	private String name;
	private String city;
	private String IATA;
	private String ICAO;
	private double latitude;
	private double longitude;
	private double altitude;
	private int timezone;
	private String DST;
	private String tzTimezone;
	private String type;
	private String source;
	
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
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
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
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public double getAltitude() {
		return altitude;
	}
	
	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}
	
	public int getTimezone() {
		return timezone;
	}
	
	public void setDST(String dST) {
		DST = dST;
	}
	
	public String getDST() {
		return DST;
	}
	
	public void setTzTimezone(String tzTimezone) {
		this.tzTimezone = tzTimezone;
	}
	
	public String getTzTimezone() {
		return tzTimezone;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getSource() {
		return source;
	}
}

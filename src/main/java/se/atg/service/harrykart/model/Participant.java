package se.atg.service.harrykart.model;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="participant")
public class Participant {

	
	private int lane;
	private String name;
	private int baseSpeed;
	public int getLane() {
		return lane;
	}
	public void setLane(int lane) {
		this.lane = lane;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseSpeed() {
		return baseSpeed;
	}
	public void setBaseSpeed(int baseSpeed) {
		this.baseSpeed = baseSpeed;
	}
}

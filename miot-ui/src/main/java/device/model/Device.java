package device.model;

public class Device {
	private String deviceName;
	private String deviceType;
	private String deviceAvailability;
	
	public Device(String name, String type, String availability){
		this.setDeviceName(name);
		this.setDeviceType(type);
		this.setDeviceAvailability(availability);
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDeviceAvailability() {
		return deviceAvailability;
	}

	public void setDeviceAvailability(String deviceAvailability) {
		this.deviceAvailability = deviceAvailability;
	}
	
	
}

package device.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "deviceDetailsBean")
public class DeviceDetails {
	
	public DeviceDetails(){
		deviceName = "no device";
		System.out.println();
	}
	
	@ManagedProperty(value="#{deviceBean}")
	DeviceBean device;
	
	private String deviceName;
	
	@PostConstruct
    public void init() {
		deviceName = device.getSelectedDeviceName();
    }

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public DeviceBean getDevice() {
		return device;
	}

	public void setDevice(DeviceBean device) {
		this.device = device;
	}
}

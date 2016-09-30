package device.services.impl;

import java.util.ArrayList;
import java.util.List;

import device.model.Device;
import device.services.DeviceService;

public class DeviceServiceImpl implements DeviceService{

	public List<Device> getDeviceList() {
		List <Device> deviceList = new ArrayList<Device>();
		deviceList.add(new Device("Bioreactor", "Bioprocessing", "schedule"));
		deviceList.add(new Device("Balance", "Scale", "schedule"));
		deviceList.add(new Device("HLPC", "Chromatography", "schedule"));
		return deviceList;
	}
	
	
	
}

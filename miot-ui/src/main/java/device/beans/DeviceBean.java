package device.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

import org.primefaces.component.datatable.DataTable;

import device.model.Device;
import device.services.impl.DeviceServiceImpl;


@ManagedBean(name = "deviceBean")
@RequestScoped
public class DeviceBean implements Serializable{
	
	
	DeviceServiceImpl deviceServiceImpl = new DeviceServiceImpl();
	public DeviceBean(){
		deviceList = new ArrayList<Device>();
		deviceList.addAll(deviceServiceImpl.getDeviceList());
		
		typeFilter = new HashMap<String,String>();
		typeFilter.put("BioProcessing (1)", "BioProcessing (1)");
		typeFilter.put("Centrifuge (2)", "Centrifuge (2)");
		typeFilter.put("Microscope (8)", "Microscope (8)");
		typeFilter.put("Mixing and Blending (2)", "Mixing and Blending (2)");
		typeFilter.put("Water Purification (2)", "Water Purification (2)");
		
		
		
	}
	
	private List<Device> deviceList;
	private List<Device> filteredDeviceList;
	
	private DataTable selectedDevice;
	private String selectedDeviceName;
	
	private Map<String,String> typeFilter;
    private List<String> selectedTypes;
    
    
    public String deviceDetails() {
    	selectedDeviceName = ((Device) selectedDevice.getRowData()).getDeviceName();
		return "/pages/device/deviceDetails.jsf";
	}
    
    
	public List<Device> getDeviceList() {		
		return deviceList;
	}
	public void setDeviceList(List<Device> deviceList) {
	
		this.deviceList = deviceList;
	}
	public List<Device> getFilteredDeviceList() {
		return filteredDeviceList;
	}
	public void setFilteredDeviceList(List<Device> filteredDeviceList) {
		this.filteredDeviceList = filteredDeviceList;
	}
	public Map<String,String> getTypeFilter() {
		return typeFilter;
	}
	public void setTypeFilter(Map<String,String> typeFilter) {
		this.typeFilter = typeFilter;
	}
	public List<String> getSelectedTypes() {
		return selectedTypes;
	}
	public void setSelectedTypes(List<String> selectedTypes) {
		this.selectedTypes = selectedTypes;
	}


	public DataTable getSelectedDevice() {
		return selectedDevice;
	}


	public void setSelectedDevice(DataTable selectedDevice) {
		this.selectedDevice = selectedDevice;
	}


	public String getSelectedDeviceName() {
		return selectedDeviceName;
	}


	public void setSelectedDeviceName(String selectedDeviceName) {
		this.selectedDeviceName = selectedDeviceName;
	}
	
	 
	
}

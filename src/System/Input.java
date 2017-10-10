package System;

import java.util.ArrayList;

public class Input {
	int road_size;
	int num_vehicle;
	String busy_hour;
	
	String[] ref_column=new String[]{"High","Medium","Low","Priority"};
	String[] ref_column_busy=new String[]{"Yes","No"};
	String[] ref_value=new String[3];
	
	float[] refdeg_road=new float[3];
	float[] refdeg_vehicle=new float[3];
	float[] refdeg_busy=new float[2];
	
	public int getRoad_size() {
		return road_size;
	}
	public void setRoad_size(int road_size) {
		this.road_size = road_size;
	}
	public int getNum_vehicle() {
		return num_vehicle;
	}
	public void setNum_vehicle(int num_vehicle) {
		this.num_vehicle = num_vehicle;
	}
	public String getBusy_hour() {
		return busy_hour;
	}
	public void setBusy_hour(String busy_hour) {
		this.busy_hour = busy_hour;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

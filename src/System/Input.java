package System;

import java.util.ArrayList;

public class Input {
	int road_size;
	int num_vehicle;
	String busy_hour;
	
	String[] attribute=new String[]{"Road Size","Number of Vehicle","Busy Hour"};
	String[] attribute_value=new String[3];
	String[] ref_column=new String[]{"High","Medium","Low","Priority"};
	String[] ref_column_busy=new String[]{"Yes","No"};
	String[] ref_value=new String[3];
	String[][] refdata=new String[3][5];
	
	float[] refdeg_road=new float[3];
	float[] refdeg_vehicle=new float[3];
	float[] refdeg_busy=new float[2];
	
	public Input(){
		
	}
	public Input(int r,int v,String b){
		road_size=r;
		num_vehicle=v;
		busy_hour=b;
		
		attribute_value[0]=r+"";
		attribute_value[1]=v+"";
		attribute_value[2]=b;
	}
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
	public void consolidateData(){
		for(int i=0;i<3;i++){
			refdata[0][i]=refdeg_road[i]+"";
		}
		refdata[0][3]="NA";
		refdata[0][4]="NA";
		for(int i=0;i<3;i++){
			refdata[1][i]=refdeg_vehicle[i]+"";
		}
		refdata[1][3]="NA";
		refdata[1][4]="NA";
		for(int i=0;i<2;i++){
			refdata[2][i+3]=refdeg_busy[i]+"";
		}
		refdata[2][0]="NA";
		refdata[2][1]="NA";
		refdata[2][2]="NA";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

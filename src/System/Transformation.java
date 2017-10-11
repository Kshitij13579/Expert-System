package System;

public class Transformation {
	Input i;
	public Transformation(){
		
	}
	public Transformation(Input i){
		this.i=i;
	}
	public Input transformInput(){
		if(i.road_size<50){
			i.refdeg_road[0]=0;
			i.refdeg_road[1]=0;
			i.refdeg_road[2]=(float)(50-i.road_size)/(50);
			i.ref_value[0]="Low";
		}
		if(i.road_size>=50 && i.road_size<75){
			i.refdeg_road[0]=0;
			i.refdeg_road[1]=(float)(75-i.road_size)/(75-50);
			i.refdeg_road[2]=1-i.refdeg_road[1];
			
			if(i.refdeg_road[1]>i.refdeg_road[2]){
				i.ref_value[0]="Medium";
			}else{
				i.ref_value[0]="Low";
			}
		}
		if(i.road_size>=75 && i.road_size<100){
			i.refdeg_road[0]=(float)(100-i.road_size)/(100-75);
			i.refdeg_road[1]=1-i.refdeg_road[0];
			i.refdeg_road[2]=0;
			
			if(i.refdeg_road[0]>i.refdeg_road[1]){
				i.ref_value[0]="High";
			}else{
				i.ref_value[0]="Medium";
			}
		
		}
		
		
		if(i.num_vehicle<50){
			i.refdeg_vehicle[0]=0;
			i.refdeg_vehicle[1]=0;
			i.refdeg_vehicle[2]=(float)(50-i.num_vehicle)/(50);
			i.ref_value[1]="Low";
			
		}
		if(i.num_vehicle>=50 && i.num_vehicle<75){
			i.refdeg_vehicle[0]=0;
			i.refdeg_vehicle[1]=(float)(75-i.num_vehicle)/(75-50);
			i.refdeg_vehicle[2]=1-i.refdeg_vehicle[1];
			if(i.refdeg_road[1]>i.refdeg_road[2]){
				i.ref_value[1]="Medium";
			}else{
				i.ref_value[1]="Low";
			}
		}
		if(i.num_vehicle>=75 && i.num_vehicle<100){
			i.refdeg_vehicle[0]=(float)(100-i.num_vehicle)/(100-75);
			i.refdeg_vehicle[1]=1-i.refdeg_vehicle[0];
			i.refdeg_vehicle[2]=0;
			if(i.refdeg_road[0]>i.refdeg_road[1]){
				i.ref_value[1]="High";
			}else{
				i.ref_value[1]="Medium";
			}
		
		}
		
		
		if(i.busy_hour.equalsIgnoreCase("Yes")){
			i.refdeg_busy[0]=1.0f;
			i.refdeg_busy[1]=0;
			i.ref_value[2]="Yes";
		}
		if(i.busy_hour.equalsIgnoreCase("No")){
			i.refdeg_busy[0]=0f;
			i.refdeg_busy[1]=1.0f;
			i.ref_value[2]="No";
		}
		i.consolidateData();
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input i1=new Input();
		i1.setRoad_size(76);
		i1.setBusy_hour("Yes");
		i1.setNum_vehicle(50);
		new Transformation(i1).transformInput();
		for(int i=0;i<3;i++){
			System.out.println(i1.refdeg_road[i]);
		}

	}

}

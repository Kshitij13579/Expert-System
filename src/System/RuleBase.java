package System;

import java.util.ArrayList;

class Rule{
	int rule_weight;
	String road_size;
	String num_vehicle;
	String busy_hour;
	
	float red;
	float yellow;
	float green;
	
	public Rule(){
		
	}
	public Rule(int weight,String road,String vehicle,String busy,float r,float y,float g){
		rule_weight=weight;
		road_size=road;
		num_vehicle=vehicle;
		busy_hour=busy;
		red=r;
		yellow=y;
		green=g;
	}
	public int getRule_weight() {
		return rule_weight;
	}
	public void setRule_weight(int rule_weight) {
		this.rule_weight = rule_weight;
	}
	public String getRoad_size() {
		return road_size;
	}
	public void setRoad_size(String road_size) {
		this.road_size = road_size;
	}
	public String getNum_vehicle() {
		return num_vehicle;
	}
	public void setNum_vehicle(String num_vehicle) {
		this.num_vehicle = num_vehicle;
	}
	public String getBusy_hour() {
		return busy_hour;
	}
	public void setBusy_hour(String busy_hour) {
		this.busy_hour = busy_hour;
	}
	public float getRed() {
		return red;
	}
	public void setRed(float red) {
		this.red = red;
	}
	public float getYellow() {
		return yellow;
	}
	public void setYellow(float yellow) {
		this.yellow = yellow;
	}
	public float getGreen() {
		return green;
	}
	public void setGreen(float green) {
		this.green = green;
	}
	
	
}
public class RuleBase {
	ArrayList<Rule> rules=new ArrayList<>();
	public RuleBase(){
		rules.add(new Rule(1,"High","High","Yes",0.2f,0.0f,0.8f));
		rules.add(new Rule(1,"Medium","High","Yes",0.1f,0.0f,0.9f));
		rules.add(new Rule(1,"Low","High","Yes",0.0f,0.0f,1.0f));
		
		rules.add(new Rule(1,"High","Medium","Yes",0.4f,0.3f,0.3f));
		rules.add(new Rule(1,"Medium","Medium","Yes",0.5f,0.0f,0.5f));
		rules.add(new Rule(1,"Low","Medium","Yes",0.3f,0.2f,0.5f));
		
		rules.add(new Rule(1,"High","Low","Yes",0.5f,0.3f,0.2f));
		rules.add(new Rule(1,"Medium","Low","Yes",0.4f,0.2f,0.4f));
		rules.add(new Rule(1,"Low","Low","Yes",0.4f,0.1f,0.5f));
		
		rules.add(new Rule(1,"High","High","No",0.5f,0.0f,0.5f));
		rules.add(new Rule(1,"Medium","High","No",0.5f,0.1f,0.4f));
		rules.add(new Rule(1,"Low","High","No",0.4f,0.0f,0.6f));
		
		rules.add(new Rule(1,"High","Medium","No",0.8f,0.1f,0.1f));
		rules.add(new Rule(1,"Medium","Medium","No",0.5f,0.1f,0.4f));
		rules.add(new Rule(1,"Low","Medium","No",0.6f,0.1f,0.3f));
		
		rules.add(new Rule(1,"High","Low","No",1.0f,0.0f,0.8f));
		rules.add(new Rule(1,"Medium","Low","No",0.7f,0.3f,0.8f));
		rules.add(new Rule(1,"Low","Low","No",0.8f,0.2f,0.8f));
	}
	
	public ArrayList<Float> match(Input inp){
		ArrayList<Float> signal=new ArrayList<Float>();
		float[] sum=new float[3];
		if(inp.road_size==-1){
			for(int i=0;i<rules.size();i++){
				if(inp.ref_value[1].equalsIgnoreCase(rules.get(i).getNum_vehicle()) && inp.ref_value[2].equalsIgnoreCase(rules.get(i).getBusy_hour())){
					sum[0]=sum[0]+rules.get(i).getRed();
					sum[1]=sum[1]+rules.get(i).getYellow();
					sum[2]=sum[2]+rules.get(i).getGreen();
				}
			}
			signal.add(sum[0]/3);
			signal.add(sum[1]/3);
			signal.add(sum[2]/3);
		}else if(inp.num_vehicle==-1){
			for(int i=0;i<rules.size();i++){
				if(inp.ref_value[0].equalsIgnoreCase(rules.get(i).getRoad_size()) && inp.ref_value[2].equalsIgnoreCase(rules.get(i).getBusy_hour())){
					sum[0]=sum[0]+rules.get(i).getRed();
					sum[1]=sum[1]+rules.get(i).getYellow();
					sum[2]=sum[2]+rules.get(i).getGreen();
				}
			}
			signal.add(sum[0]/3);
			signal.add(sum[1]/3);
			signal.add(sum[2]/3);
		}else{
			for(int i=0;i<rules.size();i++){
				if(inp.ref_value[0].equalsIgnoreCase(rules.get(i).getRoad_size()) && inp.ref_value[1].equalsIgnoreCase(rules.get(i).getNum_vehicle()) && inp.ref_value[2].equalsIgnoreCase(rules.get(i).getBusy_hour())){
					signal.add(rules.get(i).getRed());
					signal.add(rules.get(i).getYellow());
					signal.add(rules.get(i).getGreen());
				}
			}
		}
		
		return signal;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RuleBase r=new RuleBase();
		Input i=new Input(-1, 70, "Yes");
		Transformation t=new Transformation(i);
		i=t.transformInput();
		ArrayList<Float> l=r.match(i);
		System.out.println(l);
		
	}

}

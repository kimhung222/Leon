package testing;




public class Time {
	int hour;
	int minute;
	double second;
	Time(){
		this.hour   = 0;
		this.minute = 0;
		this.second = 0;
	}
	//00:00:50,850
	Time(String s){
		String[] parts = s.replace(":"," ").split(" ");
		this.hour = Integer.valueOf(parts[0]);
		this.minute = Integer.parseInt(parts[1]);
		this.second = Double.parseDouble(parts[2].replace(",","."));
		
	}
	Time(int hour,int minute,double second){
	this.hour   = hour;
	this.minute = minute;
	this.second = second;
	}
	public String STANDALIZEdottocoma(){
		
		return String.valueOf(this.second).replace('.',',');
	}
	public String hourtoString(){
		if(this.hour==0){
			return this.hour+"0";
		}
		return this.hour+"";
	}
	public String minutetoString(){
		if(this.hour==0){
			return this.minute+"0";
		}
		return this.minute+"";
	}
	public String add(Time t){
		Time result;
		result = new Time(t.hour+this.hour,t.minute+this.minute,t.second+this.second);
		return result.toString();	
	}
	public String toString(){
		String result = this.hourtoString()+":"+this.minutetoString()+":"+STANDALIZEdottocoma();
		return result;
	}

	public static void main(String[] args){
		Time time = new Time(1,20,22.2);
		Time sync = new Time(0,0,-0.1);
		System.out.println(time.add(sync));
		
		
	}
}

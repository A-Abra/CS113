package HWSix;

public class Task implements Priority{
	private String msg, priority;
	private int level;
	
	public Task (String msg,int lvl){
		this.msg = msg;
		level = lvl;
		if (level == 1)
			priority = "Low Priority";
		if (level == 2)
			priority = "Normal Priority";
		if (level == 3)
			priority = "High Priority";
		if (level == 4)
			priority = "Very High Priority";
		if (level == 5)
			priority = "Top Priority";
	}
	
	public void setPriority(int lvl) {
		level = lvl;
		if (level == 1)
			priority = "Low Priority";
		if (level == 2)
			priority = "Normal Priority";
		if (level == 3)
			priority = "High Priority";
		if (level == 4)
			priority = "Very High Priority";
		if (level == 5)
			priority = "Top Priority";
	}
	
	public int getPriority() {
		return level;
	}
	
	public String toString() {
		return msg + "\t" + "Priority Level: " + level + "\t" + priority;
	}
}
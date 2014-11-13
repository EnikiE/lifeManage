package Items;

import java.sql.Date;
import java.sql.Time;

public abstract class TimedItem extends Item{
	private Date duedate;
	private Time time;

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Date getDuedate() {
		return duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	
}

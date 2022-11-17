package studio8;

import java.util.Objects;

public class Time {

	private int hour;
	private int min;
	private int sec;
	private boolean isTwentyFour; 

	public Time() {
		
	}
	
	public Time (int h, int m, int s, boolean i) {
		hour = h;
		min = m;
		sec = s;
		isTwentyFour = i;
	}
	public static void main(String[] args) {
		Time nTime = new Time(15,2,57,true);
		System.out.println(nTime.timeToString());
    	
    }
	public String timeToString() {
		String result = "";
		if (isTwentyFour && hour > 12) {
			int h = (hour - 12);
			result = "Time is: " + h + ":" + min + ":" + sec + "PM";
		} else if (isTwentyFour && hour < 12) {
			result = "Time is: " + hour + ":" + min + ":" + sec + "AM";
		} else if (isTwentyFour && hour == 12) {
			result = "Time is: " + hour + ":" + min + ":" + sec + "PM";
		} if (hour == 0) {
			result = "Time is: " + 12 + ":" + min + ":" + sec + "AM";
		} else if (!isTwentyFour) {
			result = "Time is: " + hour + ":" + min + ":" + sec;
		}
		return result;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hour, min, sec);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && min == other.min && sec == other.sec;
	}

}
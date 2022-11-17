package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int YEAR;
	private int MONTH;
	private int DAYS;
	private boolean isHoli;
	
	/**
	 * 
	 */
	public Date() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * create a Date
	 * 
	 * @param year
	 * @param month
	 * @param days
	 */
	public Date(int year, int month, int days, boolean i) {
		YEAR = year;
		MONTH = month;
		DAYS = days;	
		isHoli = i;
	}
	
	public String dateToString () {
		String result = "";
		if (isHoli) {
			result = "Date is: " + MONTH + "/" + DAYS + "/" + YEAR + " Today is a holiday!";
		} else if (!isHoli) {
			result = "Date is: " + MONTH + "/" + DAYS + "/" + YEAR;
		}
		return result;
	}
    @Override
	public int hashCode() {
		return Objects.hash(DAYS, MONTH, YEAR);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return DAYS == other.DAYS && MONTH == other.MONTH && YEAR == other.YEAR;
	}
	public static void main(String[] args) {
		Date nDate = new Date(2003,9,24,true);
		//System.out.println(nDate.dateToString());
		
		Date jDate = new Date(2003,9,24,false);
		//System.out.println(nDate.equals(jDate));
		
		Date iDate = new Date(2002,15,12,false);
		
		Date pDate = new Date(2004,4,27,false);
		
		Date rDate = new Date(2003,1,28,false);
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(nDate);
		list.add(jDate);
		list.add(iDate);
		list.add(pDate);
		list.add(rDate);
		System.out.println(list);
		
		
    }

}

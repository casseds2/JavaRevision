class Date implements Comparable<Date>{
	
	private int day, month, year;

	Date(int day, int month, int year) {
		this.day = day; 
		this.month = month; 
		this.year = year;
	}
    
	public String toString() {
		return "" + day + "/" + month + "/" + year;
	}

	private int elapsedDays() {
  	// Number of days elapsed from 1/1/1900 to this date
    	int days = (year-1900)*365+(year-1901)/4; 
    	int k = 1;
    	while (k<month) {
			int daysInMonth;
			if (k==9||k==4||k==6||k==11)daysInMonth = 30;
				else 
					if (k==2) {
						if (year%4==0 && year!=1900) daysInMonth = 29;
						else daysInMonth = 28;
					}
			else daysInMonth = 31;
      	days = days + daysInMonth; 
      	k++; 
    	}
    	return days + day;
  	}

  	// - if in the past
  	// + if in the future
  	//= if the same

  	public int compareTo(Date d) {
  		return elapsedDays() - d.elapsedDays();
	}
}

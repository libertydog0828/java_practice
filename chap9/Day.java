public class Day{
    private int Year = 1;
    private int Month = 1;
    private int Date = 1;

    //constructer//
    public Day() {}
    public Day(int year) { this.Year = year; }
    public Day(int year, int month) { this(year); this.Month = month; }
    public Day(int year, int month, int date) { this(year, month); this.Date = date; }
    public Day(Day d){ this(d.Year, d.Month, d.Date); }

    //get Y,M,D//
    public int getYear() { return this.Year; }
    public int getMonth() { return this.Month; }
    public int getDay() { return this.Date; }

    //set Y,M,D//
    public void setYear(int year) { this.Year = year; }
    public void setMonth(int month){ this.Month = month; }
    public void setDay(int date){ this.Date = date; }

    public void set(int year, int month, int date){
        this.Year = year; this.Month = month; this.Date = date;
    }

    public int dayOfWeek(){
        int y = Year;
        int m = Month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return( y + y/4 - y/100 + y/400 + (13*m + 8)/5 + Date)%7;
    }

    public boolean equalTo(Day d){
        return Year == d.Year && Month == d.Month && Date == d.Date;
    }

    public String toString(){
        String[] wd = {"Sunday", "Monday", "Tuesday", "Wednesday",
                    "Thursday", "Friday", "Saturday"};
        
        return String.format("%04dyear %02dMonth %02dDate (%s)",
                            Year, Month, Date, wd[dayOfWeek()]);
    }

}
public class MyDateTime {

    MyDate date;
    MyTime time;


    public MyDateTime(MyDate date, MyTime time) {
        this.date = date;
        this.time = time;
    }

    public void incrementDay() {
        date.incrementDay();
    }

    public void incrementHour() {
        time.incrementHour();
    }

    public void incrementHour(int diff) {
        int dayDiff = time.incrementHour(diff);
        if ( dayDiff < 0 )
            date.decrementDay(-dayDiff);
        else
            date.incrementDay(dayDiff);
    }
    public void decrementHour(int diff) {
        incrementHour(-diff);
    }

    public void incrementMinute(int diff) {
        int dayDiff = time.incrementMinute(diff);
        if ( dayDiff < 0 )
            date.decrementDay(-dayDiff);
        else
            date.incrementDay(dayDiff);
    }

    public void decrementMinute(int diff) {
        incrementMinute(-diff);
    }

    public void incrementYear(int diff) {
        date.incrementYear(diff);
    }

    public void decrementDay() {
        date.decrementDay();
    }

    public void decrementYear() {
        date.decrementYear();
    }

    public void decrementMonth() {
        date.decrementMonth();
    }

    public void incrementMonth(int diff) {
        date.incrementMonth(diff);
    }

    public void incrementMonth() {
        date.incrementMonth();
    }

    public void incrementDay(int diff) {
        date.incrementDay(diff);
    }

    public void decrementMonth(int diff) {
        date.decrementMonth(diff);
    }

    public void decrementDay(int diff) {
        date.decrementDay(diff);
    }

    public void decrementYear(int diff) {
        date.decrementYear(diff);
    }

    public void incrementYear() {
        date.incrementYear();
    }

    public boolean isBefore(MyDateTime anotherDateTime) {
        if(date.isBefore(anotherDateTime.date))
            return true;
        else if (date.isAfter(anotherDateTime.date))
            return false;
        if (time.isBefore(anotherDateTime.time))
            return true;
        return false;
    }

    public boolean isAfter(MyDateTime anotherDateTime) {
        if(date.isAfter(anotherDateTime.date))
            return true;
        else if (date.isBefore(anotherDateTime.date))
            return false;
        if (time.isAfter(anotherDateTime.time))
            return true;
        return false;
    }
    public int dayDiff(MyDate anotherDate) {
        int monthDiff = date.month - anotherDate.month;
        int dayDiff = date.day - anotherDate.day;
        if (monthDiff == 1 || monthDiff == -1){
            if(date.month> anotherDate.month){
                dayDiff = (date.maxDays[anotherDate.month]-anotherDate.day) + date.day;
            }else if (date.month < anotherDate.month){
                dayDiff = (date.maxDays[date.month]-date.day) + anotherDate.day;
            }
        }
        return dayDiff;
    }
    public String dayTimeDifference(MyDateTime anotherDateTime) {
        int hourDifference = (time.hour) - (anotherDateTime.time.hour);
        int minDiff = (time.minute) - (anotherDateTime.time.minute);
        int dayDifference = dayDiff(anotherDateTime.date);
        dayDifference = time.minute > anotherDateTime.time.minute ? (dayDifference-1):(dayDifference);
        if ( dayDifference > 0 ) {
            if (hourDifference==0 && (time.minute > anotherDateTime.time.minute)){
                minDiff = (60-(time.minute - anotherDateTime.time.minute));
                hourDifference = 23;
            }
            return dayDifference + "day(s) "+ hourDifference + " hour(s) " + minDiff + " minute(s)" ;
        }else {
            return (hourDifference>0 ? "":hourDifference+" hour(s) ") + (minDiff>0 ? minDiff+" minute(s) ":"");
        }
    }
    public String toString(){
        return date.toString() + " " + time.toString();
    }
}

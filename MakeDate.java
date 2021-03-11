import java.time.MonthDay;

public class MakeDate {
    public MonthDay makeDate(int month, int dayOfMonth){
        MonthDay day = MonthDay.of(month,dayOfMonth);
        return day;
    }
}

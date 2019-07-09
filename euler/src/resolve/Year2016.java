package resolve;

public class Year2016 {
    private String solution(int m, int n) {
        int days = 0;

        if (m > 1) {
            for (int inx = 1; inx < m; inx++) {
                days += getMonthDay(inx);
            }
        }

        days += n;
        int daysOffset = days % 7;

        switch (daysOffset) {
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
            default:
                return "THU";
        }
    }

    private int getMonthDay(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return 31;
        else if (m == 2)
            return 29;
        else
            return 30;
    }

    public static void main(String[] args) {

        Year2016 year2016 = new Year2016();
        System.out.println(year2016.solution(5, 24));
    }
}

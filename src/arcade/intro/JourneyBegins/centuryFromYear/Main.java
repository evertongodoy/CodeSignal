package arcade.intro.JourneyBegins.centuryFromYear;

public class Main {

    public static void main(String[] args){
        System.out.println(centuryFromYear(2019));
    }

    static int centuryFromYear(int year) {

        Integer y = (Integer) year;

        String yearStr = Integer.toString(y);

        int result = 0;
        if(yearStr.length() <= 2) {
            return 1;
        } else if(yearStr.length() == 3) {
            String twoFirst = yearStr.substring(0, 1);
            String twoLast = yearStr.substring(1, 3);

            if(twoLast.equals(new String("00"))) {
                result = Integer.parseInt(twoFirst);
            } else {
                result = Integer.parseInt(twoFirst) + 1;
            }

        } else if(yearStr.length() > 3) {
            String twoFirst = yearStr.substring(0, 2);
            String twoLast = yearStr.substring(2, 4);

            if(twoLast.equals(new String("00"))) {
                result = Integer.parseInt(twoFirst);
            } else {
                result = Integer.parseInt(twoFirst) + 1;
            }
        }

        return result;
    }

}

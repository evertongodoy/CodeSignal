package arcade.intro.IslandOfKnowledge.IPV4Adress;

public class Main {

    public static void main(String[] args){

        String inputString = "172.16.254.1";
        System.out.println(isIPv4Address(inputString));
    }

    static boolean isIPv4Address(String inputString) {
        String[] arrOfStr = inputString.split("\\.");
        int totalMumber = 0;

        if (arrOfStr.length == 0)
            return Boolean.FALSE;

        for(String s : arrOfStr) {
            try{
                Integer n = Integer.valueOf(s);
                if(n >= 0 && n <= 255) {
                    totalMumber++;
                }
            } catch (Exception e) {
                return Boolean.FALSE;
            }
        }


        if(totalMumber == 4) {
            return Boolean.TRUE;
        } else return Boolean.FALSE;
    }

}

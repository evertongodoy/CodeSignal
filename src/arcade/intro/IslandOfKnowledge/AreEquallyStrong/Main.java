package arcade.intro.IslandOfKnowledge.AreEquallyStrong;

public class Main {

    public static void main(String[] args){

        System.out.println(areEquallyStrong(10, 15, 15, 10));

    }

    static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        if( (yourLeft+yourRight) == (friendsLeft+friendsRight) ){

            if(yourLeft == friendsLeft || yourLeft == friendsRight ){
                return Boolean.TRUE;
            } else return Boolean.FALSE;

        } return Boolean.FALSE;





    }


}

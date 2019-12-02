package arcade.intro.ExploringTheWaters.AlternatingSums;

public class Main {

    public static void main(String[] args){
        int[] array = {50,60,60,45,70};
        for(int i : alternatingSums(array)){
            System.out.print(i + ", ");
        }
    }

    static int[] alternatingSums(int[] a) {

        int t1 = 0;
        int t2 = 0;

        for(int i = 0; i<a.length; i++){
            if(i %2 == 0){
                t1 = t1 + a[i];
            } else {
                t2 = t2 + a[i];
            }
        }

        int[] vet = {t1, t2};
        return vet;

    }
}

package utils.utils;

public class Prectice {


    public static void main(String[] args) {
        String setnance= "Right,blue, red, new custom, white,black, yellow, black";
        setnance.replace(","," ");
        setnance.split(" ");

        String word="black";
        int count=0;

        for (int i = 0; i <setnance.length(); i++) {
             if(i==i+1){
                 count++;
             }

        }
        System.out.println(count);
    }
}




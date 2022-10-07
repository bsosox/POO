package Ej5;

public class Ej5 {

    public static void main(String[] args) {
       StringBuilder concat = new StringBuilder();
       for(String i : args){
           concat.append(i.toLowerCase());
       }
       if(esPalindromo(concat.toString())){
           System.out.println("ES PALINDROMO");;
       } else {
           System.out.println("NO ES PALINDROMO");
       }
    }

    private static boolean esPalindromo(String palabra){
        for(int i = 0; i < palabra.length()/2; i++){
            if(palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)){
                return false;
            }
        }
        return true;
    }

}
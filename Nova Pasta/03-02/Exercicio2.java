import java.util.Scanner;
 class Exercicio2 {
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Double media, valor1,valor2,valor3;

        System.out.print("digite o primeiro valor : ");
        valor1 = scanner. nextDouble();
        System.out.print("digite o segundo valor : ");
        valor2 = scanner. nextDouble();
        System.out.print("digite o terceiro valor : ");
        valor3 = scanner. nextDouble();

         media =(valor1+valor2+valor3)/3;

         System.out.print("A média dos tres valores são:  " + media);
}
 }

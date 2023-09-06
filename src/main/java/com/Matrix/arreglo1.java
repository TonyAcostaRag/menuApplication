package com.Matrix;


import java.util.Scanner;


public class arreglo1 {

    public void tridi(int nums[][]){
        Scanner leer= new Scanner(System.in);
        int num=0,sumadiag=0,acum=0,prom=0,i=0;



        for(int x=0; x<=2; x++){
            for(int y=0; y<=2; y++){

                System.out.println("Teclee un numero: ");

                do {
                    System.out.println("");
                    num=leer.nextInt();
                } while ( num % 2 != 0 );

                while (num == 0) {
                    num=leer.nextInt();
                }

                System.out.println("numero par almacenado..."+x+" "+y);
                nums[x][y]=num;
                acum=acum+nums[x][y];
//                    i++;
//                    prom=acum/i;
                if(x==y){
                    sumadiag=sumadiag+nums[x][y];
                }

//                num=leer.nextInt();
//                if(num%2==0){
//                    System.out.println("numero par almacenado..."+x+" "+y);
//                    nums[x][y]=num;
//                    acum=acum+nums[x][y];
//                    i++;
//                    prom=acum/i;
//                }
//                if(x==y){
//                    sumadiag=sumadiag+nums[x][y];
//                }


            }
        }

        for(int x=0; x<=2; x++)
        {System.out.println();
            for(int y=0; y<=2; y++)
            {

                System.out.print(nums[x][y]+" ");

            }
        }
        System.out.println("");

    /*switch(opc2){

        case 1:
            System.out.println("\n Suma de la diagonal es: "+sumadiag);
            break;
        case 2:
            System.out.println("\nEl promedio de los elementos almacenados en el arreglo es: "+prom);
            break;
        case 3:
            System.out.println("\nPosicion del numero menor encontrado por primera vez.");
            break;
        case 4:
            System.out.println("Cerrando menu.....");
            break;
    }*/

    }//cieree public void tridi
}
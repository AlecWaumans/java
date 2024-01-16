package Exercice;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alecw
 */
public class Exercice70bis {

    public static void main(String[] args) {
        ex70e();
    }

    //exemple de la boucle
    public static void exemple() {
        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("hello world");
    }

    //exerice69 
    //a. cela va afficher 12 car le sout est en dehors de la boucle
    //b. cela va afficher 33. 
    public static void while2() {//pour cette exercice toujours le faire étape par étape
        boolean shouldContinue = true;// on a un boolean
        int x = 5;//variable 
        while (shouldContinue) {//a 33 la condition de la ligne 36 est false du coup la boucle s'arrête 
            x = x + 7;
            shouldContinue = x % 11 != 0;//x modulo de 11 est different de 0
        }
        System.out.println(x);
    }

    //c.cela va afficher 22
    public static void while3() {
        boolean isDone = false;
        int count = 0;
        int x = 10;
        while (!isDone && count < 3) {
            if (x % 2 == 0) {
                x = x + 1;
                isDone = x > 20;
            } else {
                x = x + 3;
                count = count + 1;
            }
        }
        System.out.println(x);
    }

    // comment on fait pour utiliser le debug
    // si on lance le debug pour qu'il s'arrete il faut mettre un breakpoint
    //click droit => debug file
    //mettre un poitn de depart et un point de fin 
    // callstack => quel fonction appelle quel fonction
    // si on veut avancer pas par pas dans le debug les boutons sur la barre menu a droite.
    public static void ex70a() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif: ");
        int n = clavier.nextInt();
        int i = 0;

        while (i <= n) {
            System.out.println(i);
            i = i + 1;

        }

    }
    // quand on fait une boucle on doit faire 4 etapes
    // 1. initialiser
    // 2. condition
    // 3. corps de la boucle
    // 4. incrémentation

    //i = i + 5 == I+= 5 
    //i = i + 1 == I+=1 == i++
    // ordre croissant
    public static void ex70b() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif: ");
        int n = clavier.nextInt();

        while (n >= 1) {
            System.out.println(n);
            n--;
        }
    }

    // impair de 1 a n
    public static void ex70c() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif: ");
        int n = clavier.nextInt();
        int i = 0;

        while (i <= n) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
            // while (i<=n){
            //   sout(i);
            // i+=2; 

        }
    }

    // les nbres de -n à n
    public static void ex70d() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif : ");
        int n = clavier.nextInt();
        int i = -n;

        while (i <= n) {
            System.out.println(i);
            i++;

        }
    }

    // les multiples de 5 de 1 à n 
    public static void ex70e() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif: ");
        int n = clavier.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % 5 == 0){
                System.out.println(i);
            }
            i++;
            // int i = 5;
            // while (i <= n ){
            // sout(i);
            // i += 5

        }
    }

    // les multiples de n de 1 à 100
    public static void ex70f() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nouveau nombre entier positif: ");
        int n = clavier.nextInt();
        int i = 1;

        while (i < 100) {
            if (i < 100){
                System.out.println(i);
                i += n;
            }

        }
    }
}

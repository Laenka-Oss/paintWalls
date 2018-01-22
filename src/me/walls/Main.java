package me.walls;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double nD,dA,fA,nW, wA, nF,nB,bA,sA,nS, cpsm;

        Scanner in = new Scanner(System.in);

        System.out.println ("Enter #Doors");
        nD = in.nextInt();

        System.out.println ("Enter DoorArea");
        dA = in.nextInt();

        System.out.println ("Enter #windows");
        nW = in.nextDouble();

        System.out.println ("Enter WindowArea");
        wA = in.nextInt();

        System.out.println ("Enter FrontArea");
        fA = in.nextDouble();

        System.out.println ("Enter #Front");
        nF = in.nextDouble();

        System.out.println ("Enter BackArea");
        bA = in.nextDouble();

        System.out.println ("Enter #backNumbers");
        nB = in.nextDouble();

        System.out.println ("Enter SideArea");
        sA = in.nextDouble();

        System.out.println ("Enter #sides");
        nS = in.nextDouble();

        System.out.println ("Enter cpsm");
        cpsm = in.nextInt();


        System.out.println("The cost of the paintings will be $ "+(((((nF*fA)+(nB*bA)+(nS*sA))-(nD*dA)+(nW*wA)))*cpsm));


    }

}


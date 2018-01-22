package me.walls;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double n_Doors,door_A,front_A,n_Windows, window_A, n_Fronts,
                n_Backs,back_A,side_A,n_Side, cpsm;

        Scanner in = new Scanner(System.in);

        System.out.println ("Enter #Doors");
        n_Doors = in.nextInt();

        System.out.println ("Enter DoorArea");
        door_A = in.nextInt();

        System.out.println ("Enter #windows");
        n_Windows = in.nextDouble();

        System.out.println ("Enter WindowArea");
        window_A = in.nextInt();

        System.out.println ("Enter FrontArea");
        front_A = in.nextDouble();

        System.out.println ("Enter #Front");
        n_Fronts = in.nextDouble();

        System.out.println ("Enter BackArea");
        back_A = in.nextDouble();

        System.out.println ("Enter #backNumbers");
        n_Backs = in.nextDouble();

        System.out.println ("Enter SideArea");
        side_A = in.nextDouble();

        System.out.println ("Enter #sides");
        n_Side = in.nextDouble();

        System.out.println ("Enter cpsm");
        cpsm = in.nextInt();


        System.out.println("The cost of the paintings will be $ "+
                (((((n_Fronts*front_A)+(n_Backs*back_A)+(n_Side*side_A))
                        -(n_Doors*door_A)+(n_Windows*window_A)))*cpsm));


    }

}


package demo;

import java.util.Scanner;

public class AverageAcceleration {
    public static void main(String[] args) {
                double AverAcceleration,V0,V1,T;

                System.out.print("Enter v0, v1, and t : ");
                Scanner SpeedTimeInput = new Scanner(System.in);

                V0 = SpeedTimeInput.nextDouble();
                V1 = SpeedTimeInput.nextDouble();
                T = SpeedTimeInput.nextDouble();

                AverAcceleration = (int)((V1 - V0) / T);

                System.out.println("The average acceleration is " + AverAcceleration);
            }
        }




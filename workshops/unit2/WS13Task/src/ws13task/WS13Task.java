package ws13task;

import java.util.Scanner;

public class WS13Task {

    public static void main(String[] args) {
        int option;

        Scanner data = new Scanner(System.in);
        do {
            System.out.println("------Calculator------");
            System.out.println("1. --> RHOMBUS AREA");
            System.out.println("2. --> CIRCLE AREA");
            System.out.println("3. --> CONE AREA");
            System.out.println("4. --> POSITION FORMULA");
            System.out.println("5. --> FORCE FORMULA");
            System.out.println("6. --> KINETIC ENERGY");
            System.out.println("7. --> EXIT");
            
            System.out.printf("Enter your menu option --> ");
            option = data.nextInt();
            switch (option) {
                case 1:
                    getRhombusAreaData(data);
                    break;
                case 2:
                    getCircleAreaData(data);
                    break;
                case 3:
                    getConeAreaData(data);
                    break;
                case 4:
                    getPositionFormulaData(data);
                    break;
                case 5:
                    getFordeFormulaData(data);
                    break;
                case 6:
                    getKineticEnergyFormulaData(data);
                    break;
                case 7:
                    System.out.println("Good bye friend...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (option < 8);
    }

    private static void getKineticEnergyFormulaData(Scanner data) {
        System.out.println("Enter mass (kg): ");
        float mass1 = data.nextInt();
        System.out.println("Enter speed (m/s): ");
        float speed = data.nextInt();
        float kineticEnergy;
        kineticEnergy = computeKineticEnergyFormula(mass1, speed);
        System.out.println("The kinetic energy is: " + kineticEnergy + " J");
    }

    private static void getFordeFormulaData(Scanner data) {
        System.out.println("Enter mass (kg): ");
        float mass = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration1 = data.nextInt();
        float force;
        force = computeForceFormula(mass, acceleration1);
        System.out.println("The force is: " + force + " N \n");
    }

    private static void getPositionFormulaData(Scanner data) {
        System.out.println("Enter initial position (m): ");
        float initialPosition = data.nextInt();
        System.out.println("Enter the time (s) : ");
        float time = data.nextInt();
        System.out.println("Enter acceleration (m/s²): ");
        float acceleration = data.nextInt();
        System.out.println("Enter initial speed (m/s): ");
        float initialSpeed = data.nextInt();
        float position;
        position = computePositionFormula(initialPosition, time, acceleration, initialSpeed);
        System.out.println("The position is: " + position + " m \n");
    }

    private static void getConeAreaData(Scanner data) {
        System.out.println("Enter radio (cm): ");
        float radio1 = data.nextInt();
        System.out.println("Enter the aperture (cm): ");
        float aperture = data.nextInt();
        float coneArea;
        coneArea = computeConeArea(radio1, aperture);
        System.out.println("The circle area is: " + coneArea + " cm² \n");
    }

    private static void getCircleAreaData(Scanner data) {
        System.out.println("Enter radio (cm): ");
        float radio = data.nextInt();
        float circleArea;
        circleArea = computeCircleArea(radio);
        System.out.println("The circle area is: " + circleArea + " cm² \n");
    }

    private static void getRhombusAreaData(Scanner data) {
        System.out.println("Enter the major diagonal (cm): ");
        float majorDiagonal = data.nextInt();
        System.out.println("Enter the minor diagonal (cm): ");
        float minorDiagonal = data.nextInt();
        float rhrombusArea;
        rhrombusArea = computeRhombusArea(majorDiagonal, minorDiagonal);
        System.out.println("The rhombus area is: " + rhrombusArea + " cm² \n");
    }

    public static float computeRhombusArea(float majorDiagonal, float minorDiagonal) {
        float rhrombusArea = 0.00F;
        rhrombusArea = (majorDiagonal * minorDiagonal) / 2;
        return rhrombusArea;
    }

    public static float computeCircleArea(float radio) {
        float pi = 3.141592654F;
        float areaCircle = 0.00F;
        areaCircle = pi * radio * radio;
        return areaCircle;
    }

    public static float computeConeArea(float radio, float aperture) {
        float pi = 3.141592654F;
        float coneArea = 0.00F;
        coneArea = pi * radio * (radio + aperture);
        return coneArea;
    }

    public static float computePositionFormula(float initialPosition, float time, float acceleration, float initialSpeed) {
        float position = 0.00F;
        position = initialPosition + initialSpeed * time + (acceleration * time * time) / 2;
        return position;
    }

    public static float computeForceFormula(float mass, float acceleration) {
        float force = 0.00F;
        force = mass * acceleration;
        return force;
    }

    public static float computeKineticEnergyFormula(float mass, float speed) {
        float kineticEnergy = 0.00F;
        kineticEnergy = (mass * speed * speed) / 2;
        return kineticEnergy;
    }

}

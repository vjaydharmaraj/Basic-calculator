import java.util.*;
public class calculator {

        double x;
        double y;

        calculator(double x,double y)
        {
            this.x = x;
            this.y = y;
        }


    public static double addition(double x, double y) {
        System.out.println("Adding...");
        System.out.print(x + " + " + y + " = ");
        double add = x + y;
        return add;
    }

    public static double subtraction(double x, double y) {
        System.out.println("Subtracting...");
        System.out.print(x + " - " + y + " = ");
        double sub = x - y;
        return sub;
    }

    public static double multiplication(double x, double y) {
        System.out.println("Multiplicating...");
        System.out.print(x + " * " + y + " = ");
        double mul = x * y;
        return mul;
    }

    public static double division(double x, double y) {

        System.out.println("Dividing...");
        System.out.print(x + " / " + y + " = ");
        double div = x / y;
        return div;
    }

    public static double XpercentageofY(double x, double y) {
        System.out.print(x + " % " + " of " + y + " = ");
        double per = (x / 100)* y;
        return per;					
    }

    public static double percentageofYisX(double x, double y) {
        double res = x / y;
        double per = res * 100;
        return per;
    }

    public static double percentageincreaseXtoY(double x, double y) {
        double ans = ((y - x) / x) * 100;
        return ans;
    }


    public static double percentagedecreaseXtoY(double x, double y) {
        double ans = (x - y) / x * 100;
        return ans;
    }


    public static void existing() {
        System.out.println("Exited :)");
        return;
    }

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("+++++++++++++++++BASIC CALCULATOR++++++++++++++++");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter X value  : ");
            double a = sc.nextDouble();
            System.out.print("Enter Y value : ");
            double b = sc.nextDouble();
            calculator cal = new calculator(a, b);
            System.out.println("Enter Your Choice : ");
            System.out.println("                    1.Addition");
            System.out.println("                    2.Subtraction");
            System.out.println("                    3.Multiplication");
            System.out.println("                    4.Division");
            System.out.println("                    5.Percentage");
            System.out.println("                    6.Exit");
            int ch = sc.nextInt();


            switch (ch) {
                case 1: {

                    System.out.println(addition(a, b));
                    System.out.println("If u want exit press 0 or Press any key to continue");
                    int s = sc.nextInt();
                    if (s == 0) {
                        existing();
                        flag = false;
                    }
                    break;
                }

                case 2: {

                    System.out.println(subtraction(a, b));
                    System.out.println("If u want exit press 0 or Press any key to continue");
                    int s = sc.nextInt();
                    if (s == 0) {
                        existing();
                        flag = false;
                    }
                    break;
                }

                case 3: {

                    System.out.println(multiplication(a, b));
                    System.out.println("If u want exit press 0 or Press any key to continue");
                    int s = sc.nextInt();
                    if (s == 0) {
                        existing();
                        flag = false;
                    }
                    break;
                }

                case 4: {
                    System.out.println(division(a, b));
                    System.out.println("If u want exit press 0 or Press any key to continue");
                    int s = sc.nextInt();
                    if (s == 0) {
                        existing();
                        flag = false;
                    }
                    break;
                }


                case 5: {
                    boolean w = true;
                    while (w) {
                        System.out.println("Enter choice to find : ");
                        System.out.println("			1. X% of Y = ");
                        System.out.println("			2.What percent of Y is X = ");
                        System.out.println("			3.What is the percentage increase from X to Y = ");
                        System.out.println("			4.What is the percentage decrease from X to Y = ");
                        int c = sc.nextInt();
                        switch (c) {
                            case 1: {
                                System.out.println(XpercentageofY(a, b)+"%");
                                System.out.println("If u want exit press 1 or Press any key to continue");
                                int s = sc.nextInt();
                                if (s == 1) {

                                    w = false;
                                }
                                break;


                            }

                            case 2: {
                                System.out.println(percentageofYisX(a, b)+"%");
                                System.out.println("If u want exit press 1 or Press any key to continue");
                                int s = sc.nextInt();
                                if (s == 1) {

                                    w = false;
                                }
                                break;
                            }

                            case 3: {
                                System.out.println(percentageincreaseXtoY(a, b)+"%");
                                System.out.println("If u want exit press 1 or Press any key to continue");
                                int s = sc.nextInt();
                                if (s == 1) {

                                    w = false;
                                }
                                break;

                            }

                            case 4: {
                                System.out.println(percentagedecreaseXtoY(a ,b)+"%");
                                System.out.println("If u want exit press 1 or Press any key to continue");
                                int s = sc.nextInt();
                                if (s == 1) {

                                    w = false;
                                }
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    existing();
                    flag = false;
                    break;
                }
            }
        }
    }
}
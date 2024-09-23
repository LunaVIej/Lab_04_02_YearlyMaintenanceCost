public class Main
{
    public static void main(String[] args)
    {
        int springCost = 85;
        int summerCost = 250;
        int fallCost = 380;
        int winterCost = 290;
        int yearlyCost = 0;
        yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("The seasonal cost is " + summerCost + " " + springCost + " " + fallCost + " " + winterCost);
        System.out.println("The yearly maintenance cost is " + yearlyCost);

    }
}
package day32;

public class foodmain {
    public static void main(String[] args) {
        food apple = new food();
        apple.name = "Granny Smith";
        apple.color = "Green";
        apple.origin = "California";
        apple.taste = "Sour";
        apple.avgWeight = 0.5;
        apple.pcs_inthecase = 40;

        double weightOfCase = apple.totalWeightOfTheCase();
        System.out.println("Case weigth : " + weightOfCase);
        System.out.println("---------------------");
        String output = apple.toString();
        System.out.println(output);

    }
}

package day32;

public class food {
    public String name;
    public String color;
    public double avgWeight;
    public int pcs_inthecase;
    public String taste;
    public String origin;

    public double totalWeightOfTheCase() {
        return avgWeight * pcs_inthecase;
    }

    public String toString() {
        String output = "";
        output += "Color : " + color + "\n";
        output += "Average Weight  : " + avgWeight + "\n";
        output += "Taste : " + taste + "\n";
        output += "Origin : " + origin + "\n";
        output += "Average case weight :" + totalWeightOfTheCase() + "\n";
        return output;


    }


}


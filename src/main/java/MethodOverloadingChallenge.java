public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        System.out.println("6 inches equals to " + convertToCentimeters(6) + " centimeters");
        System.out.println("6 feet 5 inches equals to " + convertToCentimeters(6, 5) + " centimeters");

    }

    public static double convertToCentimeters(int heightInches) {
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        return convertToCentimeters(heightFeet * 12 + heightInches);
    }
}

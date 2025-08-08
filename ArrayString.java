public class ArrayString {
    public static void main(String[] args) {
        // Initialising an array of type String named country
        String[] country = { "India", "Australia", "Japan", "USA", "UAE", "Canada", "Brazil" };

        // length is an Array attribute that determines the array length
        int arrayLength = country.length;

        // prints array length
        System.out.println("The size of the array is: " + arrayLength);

        // print the third element (index 2)
        System.out.println(country[2]);

        // print all countries
        System.out.println("Countries:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(country[i]);
        }
    }
}

public class ComplexNumber {

    /**
     * Design a component to represent complex number and support addition of two or more complex numbers.
     */
// Declaring variables
    private int real;
    private int imaginary;

    // Constructors of this class

    // Constructor 1 - Empty Constructor
    ComplexNumber() {}

    // Constructor 2

    // Parameterised constructor
    // Constructor to accept
    // real and imaginary part
    ComplexNumber(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method
    // To add two complex number
    ComplexNumber addComp(ComplexNumber C1, ComplexNumber C2)
    {
        // Creating temporary variable
        ComplexNumber temp = new ComplexNumber();

        // Adding real part of complex numbers
        temp.real = C1.real + C2.real;

        // Adding Imaginary part of complex numbers
        temp.imaginary = C1.imaginary + C2.imaginary;

        // Returning the sum
        return temp;
    }

// Class 2
// Main Class
    // Main function
    public static void main(String[] args)
    {

        // First Complex number
        ComplexNumber C1 = new ComplexNumber(3, 2);

        // printing first complex number
        System.out.println("A = " + C1.real + " + i" + C1.imaginary);

        // Second Complex number
        ComplexNumber C2 = new ComplexNumber(9, 5);

        // Printing second complex number
        System.out.println("Complex number 2 : " + C2.real
                + " + i" + C2.imaginary);

        // Storing the sum
        ComplexNumber C3 = new ComplexNumber();

        // Calling addComp() method
        C3 = C3.addComp(C1, C2);

        // Printing the sum
        System.out.println("Sum of complex number : "
                + C3.real + " + i"
                + C3.imaginary);
    }
}

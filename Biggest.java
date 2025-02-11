class Biggest {
    private int[] arr;

    // Constructor to initialize the array
    public Biggest(int[] arr) {
        this.arr = arr;
    }

    // Method to find and display the largest element
    public void display() {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        int max = arr[0]; // Assume first element is the largest
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("The largest element in the array is: " + max);
    }

    // Main method to test the class
    public static void main(String[] args) {
        int[] numbers = {10, 25, 67, 89, 45, 99, 34};
        Biggest obj = new Biggest(numbers);
        obj.display();
    }
}

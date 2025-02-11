class MessagePrinter {
    // Method to print a greeting message
    public void printMessage(String name) {
        System.out.println("hello " + name);
    }

    // Main method to test the class
    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter();
        printer.printMessage("John");
    }
}

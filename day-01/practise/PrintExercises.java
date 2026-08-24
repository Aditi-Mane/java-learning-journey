class PrintExercises{
    void printDetails(String name, int age, String city){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("City: "+ city);
    }
    void calculate(int a, int b){
        System.out.println("---");
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multiplication: "+ (a*b));
        System.out.println("Division: "+ (a/b));
    }
    public static void main(String[] args) {
        PrintExercises p = new PrintExercises();
        p.printDetails("Aditi", 22, "Pune");

        int a=20, b=10;
        p.calculate(a,b);
    }
}
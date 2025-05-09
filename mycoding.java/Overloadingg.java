class Overloading {
    void function1() {

        System.out.println("THIS Statement is in function1:");
        System.out.println("Exiting Function1:");
    }

    void function2() {
        System.out.println("This Statement is in function 2:");
        System.out.println("Exiting function2");
    }

    public static void main(String args[]) {
        Overloading obj1 = new Overloading();
        System.out.println("Hi friends this statement is in main function()");
        System.out.println("Calling function1:");
        obj1.function1();
        Overloading obj2 = new Overloading();
        System.out.println("HI friends this statement is in main function but of part 2:");
        System.out.println("Calling Function2:");
        obj2.function2();
    }
}


    


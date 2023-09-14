public class DiamondProblem {
    // Define an interface A with a method display()
    interface A {
        void display();
    }

    // Define interfaces B and C, both extending A
    interface B extends A {
        void showB();
    }

    interface C extends A {
        void showC();
    }

    // Define a static nested class D that implements both B and C
    static class D implements B, C {
        @Override
        public void display() {
            System.out.println("Displaying from class D");
        }

        @Override
        public void showB() {
            System.out.println("Showing B from class D");
        }

        @Override
        public void showC() {
            System.out.println("Showing C from class D");
        }
    }

    public static void main(String[] args) {
        D obj = new D();
        obj.display(); // Resolves to D's implementation
        obj.showB();  // Calls D's implementation
        obj.showC();  // Calls D's implementation
    }
}

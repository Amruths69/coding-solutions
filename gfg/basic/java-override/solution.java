class Child extends Parent {
    @Override
    void show(int p) {
        System.out.print(p + " ");
    }

    @Override
    void print(int q) {
        // Add your code here.
        System.out.println(q*q);
    }
}
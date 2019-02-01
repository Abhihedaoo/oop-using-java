class Child extends Parent {
    
    // @Override
    // void show() {
    //     System.out.println("Child ");
    // }
    @Override
    void show(int number) {
        System.out.println("Child Number : " + number);
    }
}

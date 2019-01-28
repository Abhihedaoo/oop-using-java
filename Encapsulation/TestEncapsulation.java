class TestEncapsulation {
    public static void main(String[] args) {
        int age, rollNo;
        String name;
        Encapsulate encapsulate = new Encapsulate();
        encapsulate.setAge(18);
        encapsulate.setName("abhishek");
        encapsulate.setRoll(41);
        age = encapsulate.getAge();
        name = encapsulate.getName();
        rollNo = encapsulate.getRoll();
        System.out.println("Name :: " + name +
                            " Age :: " + age +
                            " Roll number :: " + rollNo);        
    }
}
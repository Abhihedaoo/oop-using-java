class Controller {
    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        AxisBank axisBank = new AxisBank();

        System.out.println("Rate of interest ICICI Bank : " + iciciBank.rateOfInterest());
        System.out.println("Rate of interest Axis Bank : " + axisBank.rateOfInterest());
        System.out.println("Number of Policies ICICI Bank : " + iciciBank.numberOfPolicies());
        System.out.println("Number of Policies Axis Bank : " + axisBank.numberOfPolicies());
    }
}
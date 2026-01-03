package com.techouts.assessment;

 class Access {
    public String name = "Amena";
    protected String proName = "Tanveer";
    String defName = "Jahan";
    private String priName = "Tannu";

    public String getPriName() {
        return priName;
    }

}

class AccessModifiers extends Access{
    void printAccess() {
        System.out.println(name);
        System.out.println(proName);
        System.out.println(defName);
        System.out.println(getPriName());                           // System.out.println(privateField); // not accessible
    }

    public static void main(String[] args) {
        AccessModifiers obj =new AccessModifiers();
                obj.printAccess();
    }
}

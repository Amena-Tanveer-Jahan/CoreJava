package strings;

public class Comparing {
    public static void main(String[] args){
        String str1 = "Tanveer";
        String str2 = "Tanveer";      //The object is only once created and str2 also refers to the first objected created
        String str3 = new String("Tanveer");//New objected is created even if the objected is previously created
        String str4 = new String("Tanveer");
        System.out.println(str1 == str2); //prints true because == will check the reference
        System.out.println(str1 == str3); //prints false because there wii be another object is created for this
        System.out.println(str1.equals(str3));//prints true because equals() will compare the content not reference
        System.out.println(str3 == str4);//prints false because new will create another object everytime
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode()); // Hashcode of all will be same because hashCode() it will check the content

    }
}

import java.util.*;
class biodata
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int age = obj.nextInt();
        obj.nextLine();
        String college = obj.nextLine();
        String blodgroup = obj.nextLine();
        String Fathername = obj.nextLine();
        String mothername = obj.nextLine();
        String adders = obj.nextLine();
        System.out.println("___________USER DATIALS________");
        System.out.println("name: " +name);
        System.out.println("age: " +age);
        System.out.println("blodgroup: " +blodgroup);
        System.out.println("Fathername: " +Fathername);
        System.out.println("mothername: " +mothername);
        System.out.println("adders: " +adders);
        
    }
}
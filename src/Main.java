
import enums.Qualification;
import enums.Role;
import enums.Sex;
import models.*;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        //Instances of a staff Class------------------------------------------------------------------------------------------->
        Staff staff1 = new Staff( 12,"Hakeem Adewale", 45, Sex.MALE, Qualification.MSC, "Adewale@gmail.com", Role.MANAGER);
        Staff staff2 = new Staff ( 323, "Adeola Johnson", 20, Sex.FEMALE, Qualification.BSC, "Adeola123@gmail.com", Role.CASHIER);
        Staff staff3 = new Staff(324, "Alex Austin",23, Sex.MALE, Qualification.HND, "alex123@gmail.com", Role.CASHIER);

        //Instances of Applicants-------------------------------------------------------------------------------------------------
        Applicant applicant1 = new Applicant(2332, "Ronke George", 26, Sex.FEMALE, Qualification.HND,
                "rony123@gmail.com", 86.0, 3);

        Applicant applicant2 = new Applicant(2322, "John Banks", 25, Sex.MALE, Qualification.BSC,
                "john123@gmail.com", 83.5, 3);

        //Instance of the Store-----------------------------------------------------------------------------
        Store store1 = new Store(212, "Ugo Mini Store");


        //CALL THE METHOD TO READ PRODUCT FILE-----------------------------------------------------------------
        ProductFileReader read = new ProductFileReader();
        store1.setProductsList(read.productList());


        //Customer instances-------------------------------------------------------------------------------------
        Customer customer1 = new Customer(1, 40000.00,  "tissue paper", 100);
        Customer customer2 = new Customer(1, 50000.00,  "orijin", 50);


        System.out.println(customer2.buyProduct(store1));
        System.out.println(staff2.sellProduct(store1, staff2, customer2) + "\n");
        System.out.println(customer2.buyProduct(store1));



    }
}

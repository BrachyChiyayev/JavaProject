import java.util.Locale;

public class MainClass
{
    public static void main(String[] args)
    {
        Visitor v1= new Visitor("brachy","chiyayev",true,15,"@ss",33.5);
        Visitor v2= new Visitor("ayala","chiyayev",true,2,"      aaa@gmail.com     ",63);
        Doctor d1= new Doctor("eliyau","chiyayev",true,15,"brachy@gmail.com","Profesor");
        Doctor d2= new Doctor("brachy","chiyayev",true,15,"aa@","Doctor");
        Pool p= new Pool();

        p.addVolunteer(v1);
        p.addVolunteer(v2);
        p.addVolunteer(d1);
        p.addVolunteer(d2);

        try
        {
            Volunteer vPanuy= p.search(); //Is there a volunteer available?
            if (vPanuy!=null)
            {
                System.out.println("vacant volunteer:" + vPanuy.toString());
            }
            else
                System.out.println("No volunteer available in the system");

            System.out.println("The details of all volunteer:");
            p.print();//print all details of volunteer


            Volunteer []vArr= p.getArr();

            if(vArr[0].getFirstName().compareTo(vArr[3].getFirstName())==0)
                System.out.println("The first name and last name of first volunteer and third volunteer are same ");
            else
                System.out.println("The first name and last name of first volunteer and third volunteer are  not same");
            System.out.println("The first name and last name of second volunteer is: "+ vArr[1].getFirstName().concat(vArr[1].getLastName()));
            System.out.println("Adress mail of second volunteer is: "+vArr[1].getMailAddress().trim());

        }catch (Exception e)
        {
            System.out.println("System error");
        }
    }
}


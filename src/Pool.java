import java.util.Locale;

public class Pool
{
    //properties
    private Volunteer [] arr= new Volunteer[10];
    private int index = 0;

    //constractors
    public Pool()
    {

    }



    //method to add volunteer to array
    public void addVolunteer(Volunteer v)
    {
        try
        {
            arr[index] = v;
            index++;
        }catch (Exception e)
        {
            System.out.println("It is not possible to add a volunteer because there is no room in the database");
        }
    }

    //method to search volunteer available
    public Volunteer search()
    {
        try
        {
            for (int i = 0; i < index-1; i++)
            {
                if (arr[i].isBusy() == false)
                {
                    arr[i].setBusy(true);
                    return arr[i];
                }
            }

        }catch (Exception e)
        {
            System.out.println("error in serach");
        }
        return null;
    }

    //method for print all volunteer in uppercase
    public void print()
    {
        for (int i = 0; i < index ; i++)
        {
            System.out.println(arr[i].toString().toUpperCase(Locale.ROOT));
        }
    }

    //getters
    public Volunteer[] getArr() {
        return arr;
    }
}

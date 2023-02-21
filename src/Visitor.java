public class Visitor extends Volunteer
{
    //properties
    private double age;
    private String familyStatus;


    //constractors
    public Visitor()
    {
        super();
    }

    public Visitor(String firstName,String lastName, boolean isBusy,double numOfDays,String mailAddress,double age)
    {
        super(firstName,lastName,isBusy,numOfDays,mailAddress);
        setAge(age);
    }

    //functions
    @Override
    public double calcBonus()
    {
        if(this.age >=18&& this.age <30)
            return getNumOfDays()*Constans.BONOUS1;
        else if (this.age >=30&&this.age <=65)
            return getNumOfDays()*Constans.BONOUS2;
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return "Visitor:" + super.getFirstName()+" "+super.getLastName()+ "  age=" + age ; // ", familyStatus=" + familyStatus;
    }

    //setters
    public void setAge(double age)
    {
        if(age>= 18 && age <=65)
            this.age = age;
        else
        if(age>100)
            System.out.println("invalid age, age upper from 100");
    }

    //getters
    public double getAge() {
        return age;
    }
}


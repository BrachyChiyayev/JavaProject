public class Doctor extends  Volunteer
{
    //properties
    private String degree;


    //constractors
    public Doctor()
    {
        super();
    }
    public  Doctor(String firstName,String lastName, boolean isBusy,double numOfDays,String mailAddress,String degree)
    {
        super(firstName,lastName,isBusy,numOfDays,mailAddress);
        setDegree(degree);
    }

    //functions
    @Override
    public double calcBonus()
    {
        if(this.degree.equals("Doctor"))
            return super.getNumOfDays()*Constans.PRICEDOCTOR;
        else if (this.degree.equals("Profesor"))
            return super.getNumOfDays()*Constans.PRICEPROFESOR;
        else
            return 0;
    }

    @Override
    public String toString()
    {
        return "Doctor:" + super.getFirstName()+" "+super.getLastName()+ ", Degree: "+ this.getDegree();
    }

    //setters
    public void setDegree(String degree) {
        this.degree = degree;
    }

    //getters
    public String getDegree() {
        return degree;
    }


}


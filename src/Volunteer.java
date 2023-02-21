 public abstract class Volunteer
    {
        //properties
        private String firstName="";
        private String lastName="";
        private boolean isBusy;
        private double numOfDays;
        private String mailAddress;

        //constractors
        public Volunteer()
        {

        }

        public Volunteer(String firstName,String lastName, boolean isBusy,double numOfDays,String mailAddress)
        {
            setFirstName(firstName);
            setLastName(lastName);
            setBusy(isBusy);
            setNumOfDays(numOfDays);
            setMailAddress(mailAddress);
        }

        //functions
        public abstract double calcBonus ();
        public abstract String toString();


        //setters
        public void setFirstName(String firstName)
        {
            if (firstName.equals(""))
                System.out.println("You not insert first name , please insert");
            else
                this.firstName = firstName;
        }

        public void setLastName(String lastName)
        {
            if (lastName.equals(""))
                System.out.println("You not insert last name , please insert");
            else
                this.lastName = lastName;
        }

        public void setBusy(boolean busy)
        {
            isBusy = busy;
        }

        public void setNumOfDays(double numOfDays)
        {
            if(numOfDays>0)
                this.numOfDays = numOfDays;
            else
                System.out.println("You must insert numOfDay upper of zero");
        }

        public void setMailAddress(String mailAddress)
        {
            boolean valid= false;
            int j=0;
            for (int i = 0; i < mailAddress.length(); i++)
            {
                if (mailAddress.charAt(i)=='@'&&i!=0&&i!=mailAddress.length()-1)
                {
                    valid = true;
                    j=i;
                    i = mailAddress.length();
                }
            }
            if(valid==true)
            {
                System.out.print("valid mail ,");
                System.out.println("domain mail is: "+mailAddress.substring(j));
                this.mailAddress = mailAddress;
            }
            else
                System.out.println("invalid mail ,please press mail adress again");

        }

        //getters
        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public boolean isBusy() {
            return isBusy;
        }

        public double getNumOfDays() {
            return numOfDays;
        }

        public String getMailAddress()
        {
            return mailAddress;
        }
    }


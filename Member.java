
/**
 * Write a description of class Member here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Member
{
    // instance variables - replace the example below with your own
    private String name;
    private int year;
    private boolean membership;
    private boolean studentMembership;
  

    /**
     * Constructor for objects of class Member
     */
    public Member(String nameOfMember, int yearTheyJoined, boolean studentMembership)
    {
        name = nameOfMember;
        year = yearTheyJoined;
        membership = true;
        studentMembership = false;
    
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    public int getYear (){
        return year;
    }
    public boolean getMembership ()
    {
        if (studentMembership = false){
            return membership;
        }
        else {
        System.out.println("This member has a student membership");
                    return false;   

    }
}
    
    public void setStudent ()
    {
        if (studentMembership = true)
        {
            membership = studentMembership;
        }
    }
    
    public void changeName (String newName)
    {
        name = newName;
    }
   
    public void show (){
        if (studentMembership = true) 
        {
            System.out.println("Name: " + name + ", member since " + year + " (student)");
        }
            

}
public int memberYears() {
int currentYear = 2022;
int numberOfYears = (currentYear) - (year);
return numberOfYears;

}
  


}
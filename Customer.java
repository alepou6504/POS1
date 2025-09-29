public class Customer{
    private String vorname;
    private String nachname;
    private int geld;
    
    public Customer(String vorname, String nachname, int geld)
    {
        setVorname(vorname);
        setNachname(nachname);
        setGeld(geld);
    }
    //default Constructor
    public Customer ()
    {
        setVorname("Fritz ");
        setNachname("Muller");
        setGeld(0);
    }
    public String getVorname()
    {
        return vorname;
    }
    public void setVorname(String vorname)
    {
        this.vorname= vorname;
    }
    public String getNachname()
    {
        return nachname;
    }
    public void setNachname(String nachname)
    {
        this.nachname= nachname;
    }
    public int getGeld()
    {
        return geld;
    }
    public void setGeld(int geld)
    {
        this.geld= geld;
    }
    
    public void printCustomer()
    {
        System.out.println("Customer name: "+ vorname + " Nachname: " + nachname + " ");
        System.out.println("Customer geld: "+ geld + "€");
        
        if (geld> 0)
        {
            System.out.println(" - hat Geld"); 
        } else {
            System.out.println("- hat kein Geld");
        }
    }
}
    
    
    

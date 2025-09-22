public class Labor{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
    //konstruktoren
    public Labor (String newGebaude, int newStock,boolean newBeamer,int newAnzPlatze)
    {
        newGebaude= gebaude;
        newStock= stock;
        newBeamer= beamer;
        newAnzPlatze= anzPlatze;
    }
    public Labor (String newGebaude,int newStock,boolean newBeamer)
    {
        newGebaude= gebaude;
        newStock= stock;
        newBeamer= beamer;
    }
    public Labor (String newGebaude,int newStock,int newAnzPlatze)
    {
        newGebaude= gebaude;
        newStock= stock;
        newAnzPlatze= anzPlatze;
    }
    public Labor (int newStock)
    {
        newStock= stock;

    }
    public Labor()
    {
        
    }
    
    //getters
    public String getGebaude()
    {
        return gebaude;
    }
    public int getStock()
    {
        return stock;
    }
    public boolean getBeamer() 
    {
        return beamer;
    }
    public int getAnzPlatze()
    {
        return anzPlatze;
    }
    //setters
    public void setGebaude(String gebaude)
    {
        this.gebaude= gebaude;
    }
    public void setStock (int stock)
    {
        this.stock= stock;
    }
    public void setBeamer (boolean beamer)
    {
        this.beamer= beamer;
    }
    public void setAnzPlatze(int anzPlatze)
    {
        this.anzPlatze= anzPlatze;
    }
}
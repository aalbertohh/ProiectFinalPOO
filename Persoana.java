public class Persoana extends Object
{
    private String nume;
    private int varsta;
    private String destinatie;

    public Persoana(String nume, int varsta, String destinatie)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.destinatie = destinatie;
    }

    public Persoana()
    {

    }

    public String getNume()
    {
        return this.nume;
    }
    public int getVarsta()
    {
        return this.varsta;
    }
    public String getDestinatie()
    {
        return this.destinatie;
    }

    public String toString()
    {
        return "Numele: "+nume+" Varsta: "+varsta+" Destinatia: "+destinatie;
    }

}
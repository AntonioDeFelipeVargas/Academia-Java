public class Main {
    public static void main(String[] args)
    {
        try (sqlConexion con = new sqlConexion()) //try with resource
        {
            con.open();
            //Esta es la implementacion de Autocloseable, no necesito poner con.close()
        }
        catch(Exception e)
        {
            System.out.println(e+ "   " +e.getMessage());
        }
    }
}
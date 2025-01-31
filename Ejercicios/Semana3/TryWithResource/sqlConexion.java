import java.sql.SQLException;

public class sqlConexion implements AutoCloseable
{
    sqlConexion()
    {
        System.out.println("Constructor");
    }
    void open() throws SQLException
    {
        System.out.println("open");
    }
    @Override
    public void close() throws SQLException
    {
        System.out.println("close");
    }
}

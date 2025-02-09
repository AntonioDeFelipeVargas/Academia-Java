public class FileService
{
    public FileDAO fileDAO;


   public void  saveFile(String name,String content)
   {
       fileDAO.saveFile(name,content);
   }

   public String readFile(String name)
   {
       return fileDAO.readFile(name);
   }
}

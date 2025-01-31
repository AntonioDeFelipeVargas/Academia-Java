public class LocalFile implements FileDAO
{
    @Override
    public void saveFile(String name, String content)
    {
        System.out.println(name + " saved " + content +  " at localStorage ");
    }

    public String readFile(String name)
    {
        return "Read from localStorage";
    }

}

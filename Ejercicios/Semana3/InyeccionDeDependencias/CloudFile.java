public class CloudFile implements FileDAO
{
    public void saveFile(String name, String content)
    {
        System.out.println(name + " saved " + content + "at cloudStorage");
    }

    public String readFile(String name)
    {
        return "Read from cloudStorage";
    }


}

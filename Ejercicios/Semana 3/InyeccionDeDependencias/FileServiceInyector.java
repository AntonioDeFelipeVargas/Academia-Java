public class FileServiceInyector
{
    static FileDAO cloudFile = new CloudFile();
    static FileDAO localFile = new LocalFile();

    public static FileService actionFile()
    {
        FileService fileService = new FileService();
        //fileService.fileDAO=cloudFile;
        fileService.fileDAO=localFile;
        
        return fileService;
    }
}

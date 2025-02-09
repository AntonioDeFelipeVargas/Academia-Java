public class Main {
    public static void main(String[] args)
    {
        FileService fileService = FileServiceInyector.actionFile();

        System.out.println(fileService.readFile("Prueba"));

       fileService.saveFile("file", "hello world");
    }
}
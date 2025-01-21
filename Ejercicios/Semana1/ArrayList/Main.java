import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
     static class Song
    {
         String title;
         String artist;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;

        }


    }//Fin Song Class
    public static void main(String[] args)
    {
        ArrayList<Song> songArrayList = new ArrayList<Song>();
        Song firstSong = new Song("1Nada", "CPorter");
        Song secondSong= new Song("Galvanize", "BTCB");
        Song thirdSong = new Song("Galvanize2", "ATCB");
        songArrayList.add(firstSong);
        songArrayList.add(secondSong);
        songArrayList.add(thirdSong);
        //System.out.println(firstSong.getTitle());
        boolean keep=true;
        Scanner scan = new Scanner(System.in);
        String option;
        do
        {
            System.out.print("Bienvenido\n");
            System.out.println("Seleccione una opcion:\n1:Salir del programa \n2:Agregar cancion");
            System.out.println("3:Buscar cancion");
            System.out.println("4:Listado de canciones");
            System.out.println("5:Listado de canciones en orden");
            option=scan.nextLine();

            if(option.equals("1"))
            {
                keep=false;
            }
            else {

                switch (option) {
                    case "2":
                        String titulo="",artista="";
                        System.out.println("Anadir Cancion");
                        System.out.println("Ingrese el titulo");
                        titulo=scan.next();

                        System.out.println("Ingrese el artista");
                        artista=scan.next();

                        Song userSong= new Song(titulo, artista);
                        songArrayList.add(userSong);
                        System.out.println("Cancion agregada");
                        break;

                    case "3":
                        System.out.println("Buscar Canciones");
                        System.out.println("Ingrese el Artista");
                        String artistaBuscar =scan.nextLine();

                        ArrayList<String> cancionesEncontradas = new ArrayList<>();
                        for(Song song:songArrayList)
                        {
                            if (song.getArtist().equals(artistaBuscar))
                            {
                                cancionesEncontradas.add(song.getTitle());
                            }
                        }
                        if(cancionesEncontradas.isEmpty()) System.out.println("No se encontraron canciones");
                            else
                            {
                                System.out.println("Se encontraron las siguientes canciones: \n"+cancionesEncontradas);
                            }

                        break;
                    case "4":
                        System.out.println("Canciones");
                        System.out.println("Artista    Titulo");
                        if(songArrayList.isEmpty())
                        {
                            System.out.println("No se encontraron canciones");
                            break;
                        }

                        for (Song song:songArrayList)
                        {
                            System.out.println(song.getArtist()+"    "+song.getTitle());
                        }
                            break;

                    case "5":
                        System.out.println("Canciones en Orden");
                        System.out.println("Artista    Titulo");
                        if(songArrayList.isEmpty())
                        {
                            System.out.println("No se encontraron canciones");
                            break;
                        }
                        songArrayList.sort(Comparator.comparing(Song::getArtist));

                        for (Song song:songArrayList)
                        {
                            System.out.println(song.getArtist()+"    "+song.getTitle());
                        }
                        break;

                    default:
                        System.out.println("Opcion invalida, intente nuevamente");
                        break;
                }
            }
        }
        while (keep);
    }




}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class FindFiles {
    ArrayList <File> list;
    public FindFiles (String Path) throws IOException{

        System.out.println("Содержимое папки " + Path);
        System.out.println();

        list = new ArrayList<File>();
        File f = new File(Path);
        // возвращает абсолютные пути ко всем файлам и каталогам в каталоге и возвращает массив файлов
        File[] listFiles = f.listFiles();
        int i=0;
        for(File f1 :listFiles){
            list.add(f1);
            System.out.println(list.get(i++));
        }
    }

    public void WriteToFileList(String path) throws IOException{
        byte [] bt;
        // запись байтов в файл
        try (FileOutputStream inFile = new FileOutputStream(path)){

            for(File f: list){
                bt = (f.getCanonicalPath() + System.getProperty("line.separator")).getBytes();
                inFile.write(bt);
            }
        }
    }

    public void ReadFile (String path, int cont) throws IOException{

        System.out.println();
        System.out.println("Вывод первых 5 элементов: ");
        System.out.println();

        String line;
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            int i = 0;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(i ==(cont-1)) {
                    return;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String pathDir = "C:\\Users\\Administrator\\IdeaProjects\\Pract21\\1";
        String pathFile = "C:\\Users\\Administrator\\IdeaProjects\\Pract21\\myFile.txt";

        FindFiles ff = new FindFiles(pathDir);
        ff.WriteToFileList(pathFile);
        ff.ReadFile(pathFile, 5);
    }

}
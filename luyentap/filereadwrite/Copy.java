package luyentap.filereadwrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Copy {
    List<String> list = new ArrayList<>();
    public void ReadToFile(String filePath){
        try{
            File file = new File(filePath);
            if(!file.exists())
                throw new FileNotFoundException();
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                list.add(line);
            }
            fr.close();
            br.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void WriteToFile(String filePath){
        try{
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            for (String o:list) {
                bufferedWriter.write(o);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Copy copy =new Copy();
        copy.ReadToFile("input.txt");
        copy.WriteToFile("output.txt");

    }
}

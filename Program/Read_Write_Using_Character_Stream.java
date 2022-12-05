import java.io.*;
class ReadWriteDemo1{
    public static void main(String args[]) throws IOException{
        File f=new File(args[0]);
        int n;
        //Reading a File
        if(f.exist()){ 
            FileReader fr=new FileReader(f);
            System.out.println(“Reading “+args[0]);
            while((n=fr.read())!=-1)
            System.out.print((char)n);
        }else  System.out.println(args[0]+” does not exists”);
        //writing to a file
        System.out.println(“\nWriting “+args[1]);
        FileWriter fw= new FileWriter(args[1]);
        String s=”This is my sample File”;
        fw.write(s);
        fw.close(); 
    }
}

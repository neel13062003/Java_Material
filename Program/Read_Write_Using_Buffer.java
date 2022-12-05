import java.io.*;
class BufferedReadWriteDemo {
	public static void main(String args[]) throws IOException{
        int n;
        FileReader fr=new FileReader(args[0]);
        System.out.println(“File opened: “+args[0]);
        BufferedReader br=new BufferedReader(fr);
        PrintWriter out=new PrintWriter(System.out,true);
        String str;
        FileWriter fw= new FileWriter(args[1]);
        BufferedWriter bw=new BufferedWriter(fw);
        
        while((str=br.readLine())!=null){
            out.println(str);
            bw.write(str+”\n”);
        }
        System.out.println(“Contents copied to: “+args[1]);
        br.close();
        br.close();
        fr.close();
	    fw.close(); 
    }
}

import java.io.*;
	class ReadWriteDemo{
	public static void main(String args[]) throws IOException{
	if(args.length!=2){
		System.out.println(“Usage: java 	ReadWriteDemoSample.txt Demo.txt”);
		System.exit(0); // terminate the program	
	}
	File f=new File(args[0]);
	byte[] b={};
    //Reading a file
    if(f.exist()){
        FileInputStream f1=new FileInputStream(f);
        int num=f1.available();
        b=new byte[num];
        int n=f1.read(b);
        String s=new String(b);
        System.out.println(“Contents of “+args[0]+ “: “+ s);
        f1.close();		
        f=null; 
    }
    else{
            System.out.println(“File does not exist”);
            System.exit(0);		
    }
    //writing to file
	f=new File(args[1]);
	if(!f.exists())
		System.out.println(args[1]+” is a New File”);
	else
	System.out.println(args[1]+” File exists, will be overwritten”);
	System.out.println(“Opening File: “+ args[1]);
	FileOutputStream fs=new FileOutputStream(args[1]);
	System.out.println(“File Opened, now writing contents”);
	fs.write(b);
	fs.flush();
	System.out.println(“contents written”);
	System.out.println(“Closing File”);
	fs.close(); 
}
}

    
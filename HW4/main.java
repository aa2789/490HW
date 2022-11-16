public class main{
    public static void main(String[] args){
        RedFileInterface rfi = new RedFileInterface();
        rfi.openForRead("plaintext.txt");
        rfi.openForWrite("test.txt");
        int c=rfi.getNextInt();
        while(rfi.endOfFile() == false){
            System.out.println((char)(c+32));
            rfi.putNextChar(c);
            c=rfi.getNextInt();
        }
        rfi.closeInFile();
        rfi.closeOutFile();

        

    }
}
import java.io.*;
/*
PlainTextFileInterface.getNextInt() shall read characters from the plain text file and convert them to
integer by subtracting 32 from the decimal value of each character (e.g. space ‐> 0).  putNextChar() shall
accept an integer, convert it to character (by adding 32) and write it to the plaintext file.  The name of
the file may be hardcoded or requested from the user.

PlainTextFileInterface (or RedFileInterface):
openFile()
getNextInt()
putNextChar()
endOfFile()
close()  

*/


public class PlainTextFileInterface {

    private BufferedWriter bw;
    private BufferedReader br;

    void openFile(String fileName) {
        try {
            File file = new File(fileName);
            if(!file.exists()){
                file.createNewFile();
            }
            this.br = new BufferedReader(new FileReader(file));            
            this.bw = new BufferedWriter(new FileWriter(file));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
    
    }
    public int getNextInt() {
        try {
            return  (br.read()-32);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return 'a'; 
    }
    public void putNextChar(int ch) {
        ch += 32;
        try {
            bw.write(ch);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void close(){

         try {

            bw.close();
            br.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
    }

    public void flushBW(){
        try {
  
            bw.flush();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }        
        
    }

    public boolean endOfFile(){
        try{
            this.br.mark(1);
            int byte1 = br.read();
            br.reset();
            return (byte1==-1)?true:false;
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        return false;

    }

    
}
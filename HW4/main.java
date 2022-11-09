public class main{
    public static void main(String[] args){
        PlainTextFileInterface pt = new PlainTextFileInterface();
        pt.openFile("plaintext.txt");
        String content = "A quick brown FoX juMpS over The laZy dog. !@#$%^*(&.+";
        for(int i=0;i<content.length();i++){
            int j= content.charAt(i)-32;
            pt.putNextChar(j);
        }
        pt.flushBW();
        while(!pt.endOfFile()){
           System.out.println((char)(pt.getNextInt()+32));
        }
        pt.close();
        

    }
}
public class ConfigParameters{
    private String fileName = "CFile.dat";
    private int numberOfUsers = 27;
    private boolean soundOn = false;
    private static ConfigParameters instance = null;

    private ConfigParameters(){

    }

    public String getFilename(){
        return this.fileName;

    }
    public int getNumberOfUsers(){
        return this.numberOfUsers;

    }
    public boolean soundIsOn(){
        return this.soundOn;

    }
    public void setSoundOn(){
        this.soundOn = true;

    }
    public void setSoundOff(){
        this.soundOn = false;

    }
    public void setFilename(String fileName){
        this.fileName = fileName;


    }
    public void setNumberOfUsers(int numberOfUsers){
        this.numberOfUsers = numberOfUsers;


    }
    public static ConfigParameters Instance(){
        if(instance == null){
            instance = new ConfigParameters();
        }
        return instance;


    }


}
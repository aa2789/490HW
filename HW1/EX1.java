class EX1{
    public static void main(String[] args){
        ConfigParameters obj = ConfigParameters.Instance();
        //check if default values are correct
        System.out.println(obj.getFilename());
        System.out.println(obj.getNumberOfUsers());
        System.out.println(obj.soundIsOn());
        //tests to demonstrate that the parameters are set and retrieved correctly.
        obj.setSoundOn();
        obj.setFilename("DFile.dat");
        obj.setNumberOfUsers(57);
        System.out.println(obj.getFilename());
        System.out.println(obj.getNumberOfUsers());
        System.out.println(obj.soundIsOn());
        ConfigParameters obj2 = ConfigParameters.Instance();
        System.out.println(obj2.getFilename());
        System.out.println(obj2.getNumberOfUsers());
        System.out.println(obj2.soundIsOn());
 
        
        
    }
}
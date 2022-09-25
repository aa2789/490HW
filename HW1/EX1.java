class EX1{
    public static void main(String[] args){
        ConfigParameters obj = ConfigParameters.Instance();
        System.out.println("Initial Values:");
        System.out.println("Filename = " + obj.getFilename());
        System.out.println("Number of Users = " + obj.getNumberOfUsers());
        System.out.println("Sound = "+ obj.soundIsOn());
        System.out.println();
        obj.setFilename("DFile.dat");
        obj.setNumberOfUsers(57);
        obj.setSoundOn();
        System.out.println("Values after changed to Filename = DFile.dat, ");
        System.out.println("                        Number of Users = 57, ");
        System.out.println("                        and Sound = true: ");
        System.out.println("Filename = " + obj.getFilename());
        System.out.println("Number of Users = " + obj.getNumberOfUsers());
        System.out.println("Sound = "+ obj.soundIsOn());
  
    }
}
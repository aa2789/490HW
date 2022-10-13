class main{
    public static void main(String[] args){
        Reflector instance = Reflector.Instance();
        for(int i=-5;i<100;i++){
            int reflectedValue = instance.reflect(i);
            int decryptedValue = instance.reflect(reflectedValue);
            if(i!=decryptedValue)System.out.println("INCORRECT _________________________________________________________________"+i);
            System.out.println(i+"  "+reflectedValue+"  "+decryptedValue);

        }
    }
}
import java.util.*;

public class Reflector{
    private final ArrayList<Integer> reflectVals;
    private final int recLen;
    private static Reflector instance = null;

    private Reflector(){
        reflectVals = new ArrayList<>();
        loadReflector();
        recLen = reflectVals.size();
    }

    private void loadReflector(){
        reflectVals.add(45);
        reflectVals.add(58);
        reflectVals.add(66);
        reflectVals.add(47);
        reflectVals.add(16);
        reflectVals.add(25);
        reflectVals.add(15);
        reflectVals.add(88);
        reflectVals.add(74);
        reflectVals.add(62);
        reflectVals.add(51);
        reflectVals.add(77);
        reflectVals.add(90);
        reflectVals.add(61);
        reflectVals.add(71);
        reflectVals.add(6);
        reflectVals.add(4);
        reflectVals.add(80);
        reflectVals.add(19);
        reflectVals.add(18);
        reflectVals.add(94);
        reflectVals.add(75);
        reflectVals.add(53);
        reflectVals.add(86);
        reflectVals.add(28);
        reflectVals.add(5);
        reflectVals.add(76);
        reflectVals.add(89);
        reflectVals.add(24);
        reflectVals.add(55);
        reflectVals.add(92);
        reflectVals.add(34);
        reflectVals.add(81);
        reflectVals.add(82);
        reflectVals.add(31);
        reflectVals.add(63);
        reflectVals.add(84);
        reflectVals.add(93);
        reflectVals.add(67);
        reflectVals.add(50);
        reflectVals.add(91);
        reflectVals.add(72);
        reflectVals.add(57);
        reflectVals.add(68);
        reflectVals.add(54);
        reflectVals.add(0);
        reflectVals.add(60);
        reflectVals.add(3);
        reflectVals.add(78);
        reflectVals.add(52);
        reflectVals.add(39);
        reflectVals.add(10);
        reflectVals.add(49);
        reflectVals.add(22);
        reflectVals.add(44);
        reflectVals.add(29);
        reflectVals.add(69);
        reflectVals.add(42);
        reflectVals.add(1);
        reflectVals.add(64);
        reflectVals.add(46);
        reflectVals.add(13);
        reflectVals.add(9);
        reflectVals.add(35);
        reflectVals.add(59);
        reflectVals.add(73);
        reflectVals.add(2);
        reflectVals.add(38);
        reflectVals.add(43);
        reflectVals.add(56);
        reflectVals.add(79);
        reflectVals.add(14);
        reflectVals.add(41);
        reflectVals.add(65);
        reflectVals.add(8);
        reflectVals.add(21);
        reflectVals.add(26);
        reflectVals.add(11);
        reflectVals.add(48);
        reflectVals.add(70);
        reflectVals.add(17);
        reflectVals.add(32);
        reflectVals.add(33);
        reflectVals.add(83);
        reflectVals.add(36);
        reflectVals.add(87);
        reflectVals.add(23);
        reflectVals.add(85);
        reflectVals.add(7);
        reflectVals.add(27);
        reflectVals.add(12);
        reflectVals.add(40);
        reflectVals.add(30);
        reflectVals.add(37);
        reflectVals.add(20);

    }

    public Integer reflect(Integer i){
        if(i<0 || i>=recLen)return -1;
        return reflectVals.get(i);

    }




    public static Reflector Instance(){
        if(instance==null){
            instance = new Reflector();
        }
        return instance;
    }

}
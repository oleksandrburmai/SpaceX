import java.util.Scanner;

public class InputData {
    Scanner scanner = new Scanner(System.in);

    public String inputStr() {
        Planets[] planets =Planets.values();
        String[] str=new String[planets.length];
        for (int i = 0; i <planets.length; i++) {
            str[i]=planets[i].getPlanetName();
        }

        //String s="";
        while (true){
            for (int i = 0; i<str.length ; i++) {
                if(str[i].equals(scanner.nextLine())){
                    return scanner.nextLine();
                }
                else {
                    System.out.println("Wrong planet name");
                }
            }
        }
    }

    public int inputNum() {
        int num;
        while (true) {
            try {
                num = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("You input wrong number. Try again");
            }
        }
        return num;
    }
}

import java.util.*;

public class calendario {
    public static void main(String[] args) {
        ArrayList <String> alunos = new ArrayList<>();
        alunos.add("Roberto");
        alunos.add("Mateus");
        alunos.add("Carlos");
        alunos.add("Eduardo");





        Map<String,String> map = new HashMap<>();
        map.put("S","   Segunda   ");
        map.put("T"," Terça      ");
        map.put("Q"," Quarta     ");
        map.put("Qu"," Quinta     ");
        map.put("Se","  Sexta " );


        System.out.print("         ");
        System.out.print(map.get("S"));
        System.out.print(map.get("T"));
        System.out.print(map.get("Q"));
        System.out.print(map.get("Qu"));
        System.out.print(map.get("Se"));
        System.out.println(" ");
        System.out.println(alunos.get(0)+ "     Presente "+ "  Presente"+ "    Ausente "+ "    Presente" +"   Ausente");
        System.out.println(alunos.get(1)+ "      Presente  "+ " Ausente"+ "     Ausente "+ "    Presente" +"   Ausente");
        System.out.println(alunos.get(2)+ "      Ausente  "+ "  Ausente"+ "     Ausente "+ "    Presente" +"   Ausente");
        System.out.println(alunos.get(3)+ "     Presente "+ "  Presente"+ "    Presente "+ "   Presente" +"   Ausente");

    }
}

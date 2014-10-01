package atividaderaquel;

import javax.swing.JOptionPane;

public class AtividadeRaquel {
    public static void main(String[] args) {
        String escalacao = "  Júlio César, D. Alves, D. Luiz, T. Silva, Maxwell, L.Gustavo, Paulinho, Oscar, Neymar, Fred, Hulk ";
        int x;    
        //parte 1
        x = escalacao.length();
        System.out.println("Tamanho da String:"+x);
        //parte 2
        escalacao= escalacao.replace("Fred" ,"Jô");
        System.out.println("Escalação atual:"+escalacao);
        //parte 3
        
        String procurar = "Ronaldinho";
        if (escalacao.toLowerCase().contains(procurar.toLowerCase())) {
            System.out.println("\nRonadinho está na escalação");
        } else {
            System.out.println("\nRonaldinho NÃO está na escalação");
        }

        //Tarefa 4
        escalacao.trim();
        System.out.println("String sem espaços: "+escalacao.trim());

        //Tarefa 5
        String[] texto = escalacao.split(",");
        JOptionPane.showMessageDialog(null, "\nEscalação\n1. " + texto[0] + "\n2. " + texto[1] + "\n3. " + texto[2]
                + "\n4. " + texto[3] + "\n5. " + texto[4] + "\n6. " + texto[5] + "\n7. " + texto[6] + "\n8. "
                + texto[7] + "\n9. " + texto[8] + "\n10. " + texto[9] + "\n11. " + texto[10]);
    }
    
}

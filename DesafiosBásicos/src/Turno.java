import java.util.Scanner;

public class Turno {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char turno = leitor.next().toUpperCase().charAt(0);
        String msg;
     
        switch (turno) {
		case 'M' : 
			msg = "Bom Dia!";
			break;	
		case 'V':
			msg = "Boa Tarde!";
			break;
		case 'N': 
			msg ="Boa Noite!" ;
			break;
		default:
			msg= "Valor Inválido!";
		}
        System.out.println(msg);
     
        }
    }



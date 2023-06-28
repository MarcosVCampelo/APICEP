import br.com.APIcep.conexao.ConexaoAPI;
import br.com.APIcep.gerador.GeradorCEP;
import br.com.APIcep.modulo.InformacoesCEP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteAPI {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ConexaoAPI conexao = new ConexaoAPI();
        GeradorCEP geradorCEP = new GeradorCEP();

        System.out.print("Digite o CEP: ");
        String cep = in.next();

        try{
            InformacoesCEP enderecoCep = conexao.conectar(cep);
            geradorCEP.gerardor(enderecoCep);


        }catch (RuntimeException e){

            System.out.println(e.getMessage());
        }







    }
}

package br.com.APIcep.gerador;

import br.com.APIcep.modulo.InformacoesCEP;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorCEP {

    public void gerardor(InformacoesCEP cep) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        //ao colocar no try, ele ja fecha, assim não precisando do close()
        try( FileWriter fw = new FileWriter("Ceps.txt", true)){
            fw.write(gson.toJson(cep));
            fw.flush();


        }catch (IOException e){
            e.printStackTrace();
        }




    }
}

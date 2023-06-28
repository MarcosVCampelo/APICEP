package br.com.APIcep.conexao;

import br.com.APIcep.modulo.InformacoesCEP;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoAPI {

    public InformacoesCEP conectar(String cep) {

        try{
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://viacep.com.br/ws/"+cep+"/json/"))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
            return new Gson().fromJson(json, InformacoesCEP.class);

        }catch (IOException | InterruptedException | IllegalStateException e){
            throw new RuntimeException("Erro na hora de buscar cep");
        }




    }


}

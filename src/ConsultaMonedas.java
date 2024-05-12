import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {



    public void consulta(String direccion){

        URI direccionFinal = URI.create("https://v6.exchangerate-api.com/v6/7e84993f65c86a9b20a16543/latest/"+direccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionFinal)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json  = response.body();
            System.out.println("LISTA "+json);



        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión");
        }

    }




}
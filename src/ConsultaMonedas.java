import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {



    public MonedaApi consulta(String direccion){

        URI direccionFinal = URI.create("https://v6.exchangerate-api.com/v6/7e84993f65c86a9b20a16543/latest/"+direccion);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccionFinal)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json  = response.body();
            //System.out.println("LISTA "+json);

            return new Gson().fromJson(response.body(), MonedaApi.class);

        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión");
        }

    }




}
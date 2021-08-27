package apoloonce2.demo.servicio;

import apoloonce2.demo.modelo.ImagenApolo;
import apoloonce2.demo.servicio.modelo.ApoloData;
import apoloonce2.demo.servicio.modelo.Data;
import apoloonce2.demo.servicio.modelo.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioApoloOnce {

    RestTemplate restTemplate;

    public ServicioApoloOnce() {
        restTemplate = new RestTemplate();
    }

    public List<ImagenApolo> obtenerInformacionImagenesApoloOnce() {
        String resourceUrl = "https://images-api.nasa.gov/search?q=apollo 11&media_type=image";
        ResponseEntity<ApoloData> responseEntity = restTemplate.getForEntity(resourceUrl,ApoloData.class );
        return transformarData(responseEntity.getBody());

    }

    private List<ImagenApolo> transformarData(ApoloData apoloData) {
        List<ImagenApolo> imagenesApolo = new ArrayList<>();
        ImagenApolo imagenApolo;

        for(Item item : apoloData.getCollection().getItems()){
            Data data = item.getData().get(0);
            imagenApolo = new ImagenApolo();
            imagenApolo.setId(data.getNasa_id());
            imagenApolo.setTitulo(data.getTitle());
            imagenApolo.setTipo(data.getMedia_type());
            imagenApolo.setFechaCreacion(data.getDate_created());
            imagenApolo.setPalabrasReservadas(data.getKeywords());
            imagenApolo.setDescripcion(data.getDescription());
            imagenApolo.setUrlImagen(item.getLinks().get(0).getHref());

            imagenesApolo.add(imagenApolo);
        }

        return imagenesApolo;
    }

}

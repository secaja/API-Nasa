package apoloonce2.demo.servicio.modelo;

import java.util.List;

public class Data {

    private String media_type;
    private String date_created;
    private List<String> keywords;
    private String nasa_id;
    private String center;
    private String description;
    private String title;

    public Data(){

    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getNasa_id() {
        return nasa_id;
    }

    public void setNasa_id(String nada_id) {
        this.nasa_id = nada_id;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

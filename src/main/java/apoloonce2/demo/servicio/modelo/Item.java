package apoloonce2.demo.servicio.modelo;

import java.util.List;

public class Item {

    private List<Data> data;
    private List<Link> links;

    public Item(){

    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}

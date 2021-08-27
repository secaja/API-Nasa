package apoloonce2.demo.modelo;

import java.util.List;

public class ImagenApolo {
    private String id;
    private String titulo;
    private String tipo;
    private String fechaCreacion;
    private List<String> palabrasReservadas;
    private String descripcion;
    private String urlImagen;

    public ImagenApolo(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<String> getPalabrasReservadas() {
        return palabrasReservadas;
    }

    public void setPalabrasReservadas(List<String> palabrasReservadas) {
        this.palabrasReservadas = palabrasReservadas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }
}

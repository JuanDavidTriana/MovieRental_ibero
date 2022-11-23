
package beans;

import java.util.Date;

public class Alquiler {
   private int id;
   private String username;
   private Date fechaAlquiler;
   private boolean novedad;
   private String genero;

    public Alquiler(int id, String username, Date fechaAlquiler, boolean novedad, String genero) {
        this.id = id;
        this.username = username;
        this.fechaAlquiler = fechaAlquiler;
        this.novedad = novedad;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alquiler{");
        sb.append("id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", fechaAlquiler=").append(fechaAlquiler);
        sb.append(", novedad=").append(novedad);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }
   
   
   
}

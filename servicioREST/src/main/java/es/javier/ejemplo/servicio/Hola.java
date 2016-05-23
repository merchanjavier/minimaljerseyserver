package es.javier.ejemplo.servicio;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("hola")
public class Hola {
    @GET
    @Path("{nombre}")
    public String decirHola(@PathParam("nombre") String name){
        StringBuilder stringBuilder = new StringBuilder("Hola ");
        stringBuilder.append(name).append("!");

        return stringBuilder.toString();
    }

}

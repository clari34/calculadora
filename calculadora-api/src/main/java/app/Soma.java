package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;


public class Soma {

    @Path("/soma/{a}/{b}")
    @GET
    public String rotaSoma(@PathParam String a,@PathParam String b) throws BadRequestException{
        try{
        Double soma = somaDois(a, b);
        return String.format("%.2f", soma);
        }catch (IllegalArgumentException iae) {
            throw new BadRequestException(iae.getMessage());
        }
    }
    public double somaDois (String a, String b) throws IllegalArgumentException{
        Double var1 = 0.;
        Double var2 = 0.;
        try {
            var1 = Double.parseDouble(a);
            var2 = Double.parseDouble(b);
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException(String.format("Números invalidos:\"%s %s\"", a, b));
        }
        if (var2 == null) {
                throw new IllegalArgumentException(String.format("Parâmetro inválido:\"%s\"", b));
            }
            
         return var1+var2;
    }
}
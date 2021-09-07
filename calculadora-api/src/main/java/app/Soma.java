package app;

import io.jooby.annotations.*;
import io.jooby.exception.*;
import java.util.Scanner;


public class Soma {

    @Path("/soma/{ope}")
    @GET
    public String rotaSoma(@PathParam String ope, String a, String b){
        try{
        double soma = Double.parseDouble(a)+Double.parseDouble(b);
        soma = Double.parseDouble(ope);
        return String.format("%.2f", soma);
        } catch(NumberFormatException nfe){
            throw new BadRequestException(String.format("Números invalidos:\"%s\"", ope));
        }
    }
}

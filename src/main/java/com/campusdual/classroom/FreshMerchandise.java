package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
    Date expirationDate = new Date(123, 4 , 4);
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public FreshMerchandise(String name, String uniqueId, String responsibleId) {
        super(name, uniqueId, responsibleId);
    }

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();
        builder.append("Localización: ");
        builder.append(getLocation()); //No se usa el this. porque es un metodo de la clase padre
        builder.append(". ");
        builder.append("Fecha de caducidad: ");
        builder.append(sdf.format(this.getExpirationDate()));//Este lleva el this. porque si que es de esta misma clase
        return builder.toString();
    }

    public String getFormattedDate(Date expirationDate) {
        return sdf.format(expirationDate);
    }

    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
;

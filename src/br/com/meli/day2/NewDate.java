package br.com.meli.day2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class NewDate {
    
    private Date date;
    private GregorianCalendar gc = new GregorianCalendar();

    public NewDate(Date date) {
        this.gc.setTime(date);
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void upDate(){
        this.gc.add(Calendar.DAY_OF_MONTH,1);
        this.date = this.gc.getTime();
    }

    @Override
    public String toString() {
        return  "date =" + date.toString();
    }

}

package application.app.com.dbflow_test1.daoEntity;


import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.Date;

@Table(database = DataBase.class)
public class Datos extends BaseModel{

    @Column
    @PrimaryKey(autoincrement = true)
    long id;

    @Column
    Integer integer;

    @Column
    Double real;

    @Column
    String text;

    @Column
    Date numDate;

    @Column
    Boolean numBool;

    public Datos() {
    }

    public Datos(Integer integer, Double real, String text, Date numDate, Boolean numBool) {
        this.integer = integer;
        this.real = real;
        this.text = text;
        this.numDate = numDate;
        this.numBool = numBool;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getNumDate() {
        return numDate;
    }

    public void setNumDate(Date numDate) {
        this.numDate = numDate;
    }

    public Boolean getNumBool() {
        return numBool;
    }

    public void setNumBool(Boolean numBool) {
        this.numBool = numBool;
    }

    @Override
    public String toString() {
        return "\nDatos {\n" +
                "id= " + id +
                "\ninteger= " + integer +
                "\nreal= " + real +
                "\ntext= " + text +
                "\nnumDate= " + numDate +
                "\nnumBool= " + numBool +
                "\n}";
    }
}

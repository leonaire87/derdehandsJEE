package be.ehb.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @NotBlank
    private String naam;

    @NotBlank
    private String omschrijving;
    @NotBlank
    @Size(min = 4, max = 20, message = "{username_error}")
    private String userName;
    @Size(min = 4, max = 20, message = "{email_error}")
    private String email;

    @DecimalMin(value = "0.01")
    private BigDecimal vraagPrijs;

    public Data() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getVraagPrijs() {
        return vraagPrijs;
    }

    public void setVraagPrijs(BigDecimal vraagPrijs) {
        this.vraagPrijs = vraagPrijs;
    }
}

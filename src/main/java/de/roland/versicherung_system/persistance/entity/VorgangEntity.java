package de.roland.versicherung_system.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "VORGAENGE")
@Entity
public class VorgangEntity {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private Date vorgangsDatum;
    
    private String fahrzeugTyp;
    
    private String fahrzeugFarbe;
    
    
    public Long getId() {
        return id;
    }
    
    public Date getVorgangsDatum() {
        return vorgangsDatum;
    }
    
    public String getFahrzeugTyp() {
        return fahrzeugTyp;
    }
    
    public String getFahrzeugFarbe() {
        return fahrzeugFarbe;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public void setVorgangsDatum(Date vorgangsDatum) {
        this.vorgangsDatum = vorgangsDatum;
    }
    
    public void setFahrzeugTyp(String fahrzeugTyp) {
        this.fahrzeugTyp = fahrzeugTyp;
    }
    
    public void setFahrzeugFarbe(String fahrzeugFarbe) {
        this.fahrzeugFarbe = fahrzeugFarbe;
    }
    
}

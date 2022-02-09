package de.roland.versicherung_system.DTOs;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class VorgangEntityDto implements Serializable {
    private final Long id;
    private final Date vorgangsDatum;
    private final String fahrzeugTyp;
    private final String fahrzeugFarbe;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VorgangEntityDto entity = (VorgangEntityDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.vorgangsDatum, entity.vorgangsDatum) &&
                Objects.equals(this.fahrzeugTyp, entity.fahrzeugTyp) &&
                Objects.equals(this.fahrzeugFarbe, entity.fahrzeugFarbe);
    }
    
    public String getFahrzeugFarbe() {
        return fahrzeugFarbe;
    }
    
    public String getFahrzeugTyp() {
        return fahrzeugTyp;
    }
    
    public Long getId() {
        return id;
    }
    
    public Date getVorgangsDatum() {
        return vorgangsDatum;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, vorgangsDatum, fahrzeugTyp, fahrzeugFarbe);
    }
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "vorgangsDatum = " + vorgangsDatum + ", " +
                "fahrzeugTyp = " + fahrzeugTyp + ", " +
                "fahrzeugFarbe = " + fahrzeugFarbe + ")";
    }
    
    public VorgangEntityDto(Long id, Date vorgangsDatum, String fahrzeugTyp, String fahrzeugFarbe) {
        this.id = id;
        this.vorgangsDatum = vorgangsDatum;
        this.fahrzeugTyp = fahrzeugTyp;
        this.fahrzeugFarbe = fahrzeugFarbe;
    }
}

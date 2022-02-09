package de.roland.versicherung_system.DTOs;

import java.time.LocalDateTime;
import java.util.Date;

public class VertragDto {

    private VertragDtoStatusEnum status;
    
    private String vertragsnummer;
    
    public VertragDtoStatusEnum getStatus() {
        return status;
    }
    
    public String getVertragsnummer() {
        return vertragsnummer;
    }
    
    public VertragDto(VertragDtoStatusEnum status, String vertragsnummer) {
        this.status = status;
        this.vertragsnummer = vertragsnummer;
    }
}

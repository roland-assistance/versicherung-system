package de.roland.versicherung_system.service;

import de.roland.versicherung_system.DTOs.VertragDto;
import de.roland.versicherung_system.DTOs.VertragDtoStatusEnum;
import de.roland.versicherung_system.persistance.entity.ZahlungStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VertragService {

    @Autowired
    private VertragStatusStaticService vertragstatusService;
    
    
    public VertragDto getVertrag(String vertragsnummer){
        VertragDtoStatusEnum vertragDtoStatus = this.getVertragStatus(vertragsnummer);
        VertragDto vertragDto = new VertragDto(vertragDtoStatus,vertragsnummer);
        return vertragDto;
    }
    
    public VertragDtoStatusEnum getVertragStatus(String vertragsnummer) {
        if(vertragsnummer == null || vertragsnummer.trim().equals("")){
            throw new IllegalArgumentException(vertragsnummer);
        }
        ZahlungStatusEnum zahlungStatus = this.vertragstatusService.getZahlungStatus(vertragsnummer);
        if(zahlungStatus == ZahlungStatusEnum.ABGESCHLOSSEN){
            return VertragDtoStatusEnum.GUELTIG;
        }
        boolean vertragNeu = this.vertragstatusService.isNeuVertrag(vertragsnummer);
        if ((zahlungStatus == ZahlungStatusEnum.ERWARTET && vertragNeu) ||
        (zahlungStatus == ZahlungStatusEnum.NICHT_VOLLSTAENDIG && !vertragNeu)) {
            return VertragDtoStatusEnum.GUELTIG_ABER_DECKUNG_NICHT_VOLLSTAENDIG;
        }
        return VertragDtoStatusEnum.UNGUELTIG;
    }
    
}

package de.roland.versicherung_system.service;

import de.roland.versicherung_system.persistance.entity.ZahlungStatusEnum;
import org.springframework.stereotype.Service;

@Service
public class VertragStatusStaticService {
    
    public boolean isNeuVertrag(String vertragsnummer) {
        return Boolean.TRUE;
    }
    
    public ZahlungStatusEnum getZahlungStatus(String vertragsnummer) {
        return ZahlungStatusEnum.ABGESCHLOSSEN;
    }
}

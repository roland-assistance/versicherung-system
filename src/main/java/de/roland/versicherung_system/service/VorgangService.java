package de.roland.versicherung_system.service;

import de.roland.versicherung_system.DTOs.VorgangDto;
import de.roland.versicherung_system.persistance.repository.VorgangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class VorgangService {
    
    @Autowired
    private VorgangRepository vorgangRepository;

    public List<VorgangDto> getAllVorgaengeStatic(){
        VorgangDto vorgangDTo = new VorgangDto(1L, new Date(), "PKW", "rot");
        VorgangDto vorgangDTo1 = new VorgangDto(2L, new Date(), "LKW", "blau");
        List<VorgangDto> vorgangDTos = new ArrayList<>();
        vorgangDTos.add(vorgangDTo);
        vorgangDTos.add(vorgangDTo1);
        return vorgangDTos;
    }
    
   public List<VorgangDto> getAllePKWVorgaengeAusDerDB(){
        // Bitte implementieren Sie die Methode.
        return null;
    }
    
    
    
}

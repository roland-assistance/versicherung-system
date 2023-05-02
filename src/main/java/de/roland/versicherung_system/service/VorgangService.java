package de.roland.versicherung_system.service;

import de.roland.versicherung_system.DTOs.VorgangDto;

import java.util.List;

public interface VorgangService {
    
    List<VorgangDto> getAllVorgaengeStatic();
    
    List<VorgangDto> getAllePKWVorgaengeAusDerDB();
    
}

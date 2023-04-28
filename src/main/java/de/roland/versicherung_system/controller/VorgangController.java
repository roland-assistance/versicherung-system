package de.roland.versicherung_system.controller;

import de.roland.versicherung_system.DTOs.VorgangDto;
import de.roland.versicherung_system.service.VorgangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = VorgangController.PATH_BASE)
public class VorgangController {
    
    @Autowired
    private VorgangService vorgangService;
    
    public static final String PATH_BASE = "/vorgang";
    
    @GetMapping(path = "/pkws", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<VorgangDto> getAllePKWVorgaenge() {
        return vorgangService.getAllVorgaengeStatic();
        
    }
    
    
}

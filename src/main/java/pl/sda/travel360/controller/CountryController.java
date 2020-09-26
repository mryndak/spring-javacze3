package pl.sda.travel360.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pl.sda.travel360.dto.CountryDto;
import pl.sda.travel360.service.CountryService;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/country")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService service;

    @GetMapping
    public List<CountryDto> getAllCountries() {
        log.info("Get all countries");
        return service.getAllCountries();
    }

    @PostMapping
    public void createCountry(@RequestBody CountryDto countryDto) {
        log.info("Create country for request: {}", countryDto);
        service.addCountry(countryDto.getName());
    }
}

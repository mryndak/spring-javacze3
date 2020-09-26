package pl.sda.travel360.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.travel360.domain.Country;
import pl.sda.travel360.dto.CountryDto;
import pl.sda.travel360.repository.CountryRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository repository;

    public List<CountryDto> getAllCountries() {
        List<Country> countries = repository.findAll();

        return countries.stream()
                .map(country -> new CountryDto(country.getId(), country.getName()))
                .collect(Collectors.toList());
    }

    public void addCountry(String name) {
        Country country = new Country();
        country.setName(name);

        repository.save(country);
    }

    public CountryDto updateCountry(Long id, String name) {
        Country country = repository.findById(id)
                .map(c -> {
                    c.setName(name);
                    return repository.save(c);
                }).orElseThrow();
        return new CountryDto(country.getId(), country.getName());
    }

    public void deleteCountry(Long id) {
        repository.deleteById(id);
    }
}

package app.rapport.statistique.service;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.domain.StatistiqueFileService;
import app.rapport.statistique.models.StatistiqueModel;
import au.com.bytecode.opencsv.CSVReader;

@Service
public class StatistiqueCsvFileImpl implements StatistiqueFileService {
	@Override
	public List<StatistiqueModel> extractFile(String path) throws MetierException {
		ObjectMapper objectMapper = new ObjectMapper();

        TypeReference<List<StatistiqueModel>> typeReference = new TypeReference<List<StatistiqueModel>>() {};

        byte[] decodedBytes = Base64.getDecoder().decode(path);

        try (InputStream inputStream = new ByteArrayInputStream(decodedBytes);
             InputStreamReader reader = new InputStreamReader(inputStream);
             CSVReader csvReader = new CSVReader(reader)) {
            // Read all lines from the CSV content
            List<String[]> lines = csvReader.readAll();

            // Convert the lines into StatistiqueModel objects
            List<StatistiqueModel> statistics = convertLinesToPersons(lines);

            // Do something with the list of StatistiqueModels
            return statistics;
        } catch (IOException e) {
            e.printStackTrace();
            throw new MetierException("Impossible de prendre en charge le fichier");
        }
		
	}
	
    private List<StatistiqueModel> convertLinesToPersons(List<String[]> lines) {
        return lines.stream()
                .skip(1) // Skip header row
                .map(this::convertLineToPerson)
                .collect(Collectors.toList());
    }

    private StatistiqueModel convertLineToPerson(String[] line) {
    	StatistiqueModel person = new StatistiqueModel();
    	line = line[0].split(";");
        person.setNom(line[0]);
        person.setPrenom(line[1]);
        person.setAge(Integer.parseInt(line[2]));
        person.setProfession(line[3]);
        person.setSalaire(Integer.parseInt(line[4]));
    	System.out.println(person.getAge());
        return person;
    }

}

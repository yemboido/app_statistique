package app.rapport.statistique.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import app.rapport.statistique.config.MetierException;
import app.rapport.statistique.domain.StatistiqueFileService;
import app.rapport.statistique.models.StatistiqueModel;

@Service
public class StatistiqueXmlFileImpl implements StatistiqueFileService {

	@Override
	public List<StatistiqueModel> extractFile(String path) throws MetierException {
	
			XmlMapper xmlMapper = new XmlMapper();

	        // Specify the path to your XML file
			byte[] decodedBytes = Base64.getDecoder().decode(path);
	        List<StatistiqueModel> person;
			try {
				InputStream inputStream = new ByteArrayInputStream(decodedBytes);
				person = xmlMapper.readValue(inputStream, new TypeReference<List<StatistiqueModel>>() {
				});
				return person;
			} catch (StreamReadException e) {
				e.printStackTrace();
				throw new MetierException("Impossible de lire le fichier");
				
			} catch (DatabindException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				throw new MetierException("Impossible de retrouver ton les champs dans le fichier");
			} catch (IOException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				throw new MetierException("Impossible de prendre en charge le fichier");
			}

	}

}

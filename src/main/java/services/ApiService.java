package services;

import org.springframework.web.client.RestTemplate;

public class ApiService {
    private final String API_KEY = "805a8889a59443a49c04f7882c8045dc";
    private final String API_BASE_URL = "http://api.football-data.org/v4/";

    RestTemplate restTemplate = new RestTemplate();
}
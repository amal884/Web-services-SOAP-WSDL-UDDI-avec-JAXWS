package server;


import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

// deployer un webservice jaxws . utiliser une classe qui s'appellle end point
public class ServerJWS {
    public static void main(String[] args) {

        String url ="http://localhost:8084/";
        Endpoint.publish(url,new BanqueService());// demarer un server qui deploi un web service qu'on va lui consulter avec ce url
        System.out.println("Web  service deploye sur" + url);



    }











}

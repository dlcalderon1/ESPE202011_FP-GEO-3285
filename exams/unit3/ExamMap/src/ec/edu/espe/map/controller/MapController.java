package ec.edu.espe.map.controller;

import ec.edu.espe.map.model.Map;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import utils.FileManager;

public class MapController {

    public void save (Map map) {
        String data = map.getTitle() + "," + map.getScale() + "," + map.getType()
                + "," + map.getLocation() + "," + map.getYear() + "," + map.getRasterResolution();
        FileManager.save(data, "map");
    }

    public static String read() {
        String data;
        data = FileManager.read("map.csv");
        return data;
    }

}

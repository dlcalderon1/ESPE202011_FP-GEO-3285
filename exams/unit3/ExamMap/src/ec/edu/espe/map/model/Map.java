package ec.edu.espe.map.model;

public class Map {
    private String title;
    private String scale;
    private String type;
    private String location;
    private int year;
    private float rasterResolution;

    public Map(String title, String scale, String type, String location, int year, float rasterResolution) {
        this.title = title;
        this.scale = scale;
        this.type = type;
        this.location = location;
        this.year = year;
        this.rasterResolution = rasterResolution;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the scale
     */
    public String getScale() {
        return scale;
    }

    /**
     * @param scale the scale to set
     */
    public void setScale(String scale) {
        this.scale = scale;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the rasterResolution
     */
    public float getRasterResolution() {
        return rasterResolution;
    }

    /**
     * @param rasterResolution the rasterResolution to set
     */
    public void setRasterResolution(float rasterResolution) {
        this.rasterResolution = rasterResolution;
    }
    
}

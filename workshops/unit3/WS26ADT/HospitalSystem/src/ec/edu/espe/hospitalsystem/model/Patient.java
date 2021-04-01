package ec.edu.espe.hospitalsystem.model;

public class Patient {

    private String name;
    private String CI;
    private int age;
    private String bloodType;
    private boolean isparacetamolAllergic;
    private float weight;
    private String sex;

    public Patient(String name, String CI, int age, String bloodType, boolean isparacetamolAllergic, float weight, String sex) {
        this.name = name;
        this.CI = CI;
        this.age = age;
        this.bloodType = bloodType;
        this.isparacetamolAllergic = isparacetamolAllergic;
        this.weight = weight;
        this.sex = sex;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the CI
     */
    public String getCI() {
        return CI;
    }

    /**
     * @param CI the CI to set
     */
    public void setCI(String CI) {
        this.CI = CI;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the isparacetamolAllergic
     */
    public boolean isIsparacetamolAllergic() {
        return isparacetamolAllergic;
    }

    /**
     * @param isparacetamolAllergic the isparacetamolAllergic to set
     */
    public void setIsparacetamolAllergic(boolean isparacetamolAllergic) {
        this.isparacetamolAllergic = isparacetamolAllergic;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

}

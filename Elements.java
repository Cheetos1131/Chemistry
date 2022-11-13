//Make a some code that creates and object of each element with  all the required information for it
//Add the params to the Elements constructor

/**
 * Elements class contains the instance variables of the elements objects.
 */
public class Elements {
    //Instance Variables
    private String name;
    private String id;
    private String magneticOrdering;
    private String region;
    private int atomicNumber;
    private int group;
    private int period;
    private float density;
    private float electronegativity;
    private float atomicMass;

    public Elements(String name, String id, String magneticOrdering, String region, int atomicNumber, int group, int period, float density, float electronegativity, float atomicMass) {
        this.name = name;
        this.id = id;
        this.magneticOrdering = magneticOrdering;
        this.region = region;
        this.atomicNumber = atomicNumber;
        this.group = group;
        this.period = period;
        this.density = density;
        this.electronegativity = electronegativity;
        this.atomicMass = atomicMass;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public String getMagneticOdering() {
        return this.magneticOrdering;
    }

    public String getRegion() {
        return this.region;
    }

    public int getAtomicNumber() {
        return this.atomicNumber;
    }

    public int getGroup() {
        return this.group;
    }

    public int getPeriod() {
        return this.period;
    }

    public float getDensity() {
        return this.density;
    }

    public float getElectronegativity() {
        return this.electronegativity;
    }

    public float getAtomicMass() {
        return this.atomicMass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setMagneticOrdering(String magneticOrdering) {
        this.magneticOrdering = magneticOrdering;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public void setElectronegativity(float electronegativity) {
        this.electronegativity = electronegativity;
    }

    public void setAtomicMass(float atomicMass) {
        this.atomicMass = atomicMass;
    }
}
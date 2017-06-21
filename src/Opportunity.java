/**
 * Created by naofumiezaki on 6/20/17.
 */
public class Opportunity {
    private String title;
    private String organization;
    private String city;
    private String state;
    private String min;
    private String max;

    public Opportunity(String title, String organization, String city, String state, String min, String max) {
        this.title = title;
        this.organization = organization;
        this.city = city;
        this.state = state;
        this.min = min;
        this.max = max;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String toString(){
        return "Title: " +this.getTitle()
                + ", Organization: " + this.organization
                + ", Location: " + this.city
                + ", " + this.state
                + ", Pay: "
                + this.min + "-" + this.max;
    }
}

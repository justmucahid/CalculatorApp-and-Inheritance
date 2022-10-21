package polymorphism;

public class CorporateCustomer extends CustomerInheritance {
    private String _vergiId;
    private String _firmaAd;

    public String getVergiId() {
        return _vergiId;
    }

    public void setVergiId(String vergiId) {
       _vergiId = vergiId;
    }

    public String getFirmaAd() {
        return _firmaAd;
    }

    public void setFirmaAd(String firmaAd) {
       _firmaAd = firmaAd;
    }

}

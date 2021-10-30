public class Category {
    private String catecode;
    private String catdesc;

    public Category(String catecode, String catdesc) {
        this.catecode = catecode;
        this.catdesc = catdesc;
    }

    public String getCatecode() {
        return catecode;
    }

    public void setCatecode(String catecode) {
        this.catecode = catecode;
    }

    public String getCatdesc() {
        return catdesc;
    }

    public void setCatdesc(String catdesc) {
        this.catdesc = catdesc;
    }
}

public class Horror  extends  Book{
    private int fearlevel;
    public Horror(String title, int pages, String author, boolean status, int minAge,int year,int price,int fearlevel)
    {
        super(title, pages,status,minAge,year,price);
        this.fearlevel = fearlevel;
    }
    public String toString() {
        return ("Book title: " + getTitle() + "\nBook's author: " + getAuthor() + "\nBook's pages: "
                + getPages() + "\nmin age:" +getMinAge()+ "\nstatus: " + isStatus() +"\nprice: "+getPrice()+"\nyear: " +getYear()+"\nFear level is:"+fearlevel+"\n_____________________________"); }

    public int getFearlevel() {
        return fearlevel;
    }

    public void setFearlevel(int fearlevel) {
        this.fearlevel = fearlevel;
    }
}
